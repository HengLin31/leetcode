package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/20.
 */
class LongestSubstringWithoutRepeatingCharactersTest extends Specification {
    def "test LongestSubstringWithoutRepeatingCharacters"(){
        setup: "setup LongestSubstringWithoutRepeatingCharacters"
        Verification verification = new LongestSubstringWithoutRepeatingCharacters()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input       || output
        "abcabcbb"  || 3 //abc
        "bbbbb"     || 1 //b
        "pwwkew"    || 3 //wke
    }
}
