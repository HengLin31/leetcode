package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ValidPalindromeTest extends Specification {
    def "test ValidPalindrome"() {
        setup: "setup ValidPalindrome"
        Verification verification = new ValidPalindrome()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                             || output
        "A man, a plan, a canal: Panama"  || true
        "race a car"                      || false
    }
}
