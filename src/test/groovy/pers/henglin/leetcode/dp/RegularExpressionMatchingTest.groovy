package pers.henglin.leetcode.dp

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/27.
 */
class RegularExpressionMatchingTest extends Specification {
    def "test RegularExpressionMatching"(){
        setup: "setup RegularExpressionMatching"
        Verification verification = new RegularExpressionMatching()

        expect: "verify result"
        verification.verify(input as String[]) == output

        where: "input data set"
        input                           || output
        ["aa", "a"]                     || false
        ["aa", "a*"]                    || true
        ["ab", ".*"]                    || true
        ["aab", "c*a*b"]                || true
        ["mississippi", "mis*is*p*."]   || false

    }
}
