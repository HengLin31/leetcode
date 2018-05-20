package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/20.
 */
class LongestSubstringWithoutRepeatingCharactersTest extends Specification {
    def "test LongestSubstringWithoutRepeatingCharactersTest"(){
        setup: "setup LongestSubstringWithoutRepeatingCharactersTest"
        Verification longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters()

        expect: "verify result"
        longestSubstringWithoutRepeatingCharacters.verify(input) == output

        where: "input data set"
        input       || output
        "abcabcbb"  || 3 //abc
        "bbbbb"     || 1 //b
        "pwwkew"    || 3 //wke
    }
}
