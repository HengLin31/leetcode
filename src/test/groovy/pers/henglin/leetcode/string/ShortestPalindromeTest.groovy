package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ShortestPalindromeTest extends Specification {
    def "test ShortestPalindrome"(){
        setup: "setup ShortestPalindrome"
        Verification verification = new ShortestPalindrome()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input      || output
        "aacecaaa" || "aaacecaaa"
        "abcd"     || "dcbabcd"
    }
}
