package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.dp.RegularExpressionMatching
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/27.
 */
class RegularExpressionMatchingTest extends Specification {
    def "test RegularExpressionMatching"(){
        setup: "setup RegularExpressionMatching"
        Verification regularExpressionMatching = new RegularExpressionMatching()

        expect: "verify result"
        regularExpressionMatching.verify(input as String[]) == output

        where: "input data set"
        input                           || output
        ["aa", "a"]                     || false
        ["aa", "a*"]                    || true
        ["ab", ".*"]                    || true
        ["aab", "c*a*b"]                || true
        ["mississippi", "mis*is*p*."]   || false

    }
}
