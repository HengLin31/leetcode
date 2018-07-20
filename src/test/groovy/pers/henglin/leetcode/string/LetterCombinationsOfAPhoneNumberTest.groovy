package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class LetterCombinationsOfAPhoneNumberTest extends Specification {
    def "test LetterCombinationsOfAPhoneNumber"(){
        setup: "setup LetterCombinationsOfAPhoneNumber"
        Verification verification = new LetterCombinationsOfAPhoneNumber()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input       || output
        "23"        || ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    }
}
