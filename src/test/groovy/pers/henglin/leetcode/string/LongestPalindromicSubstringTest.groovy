package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.array.MedianOfTwoSortedArrays
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/22.
 */
class LongestPalindromicSubstringTest extends Specification {
    def "test LongestPalindromicSubstring"(){
        setup: "setup LongestPalindromicSubstring"
        Verification longestPalindromicSubstring = new LongestPalindromicSubstring()

        expect: "verify result"
        longestPalindromicSubstring.verify(input) == output

        where: "input data set"
        input   || output
        "babad" || "aba"
        "cbbd"  || "bb"

    }
}
