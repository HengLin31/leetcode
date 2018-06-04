package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/6/4.
 */
class LongestCommonPrefixTest extends Specification {
    def "test LongestCommonPrefix"(){
        setup: "setup LongestCommonPrefix"
        Verification verification = new LongestCommonPrefix()

        expect: "verify result"
        verification.verify(input as String[]) == output

        where: "input data set"
        input                       || output
        ["flower","flow","flight"]  || "fl"
        ["dog","racecar","car"]     || ""

    }
}
