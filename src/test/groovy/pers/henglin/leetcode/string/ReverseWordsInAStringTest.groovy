package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ReverseWordsInAStringTest extends Specification {
    def "test ReverseWordsInAString"() {
        setup: "setup ReverseWordsInAString"
        Verification verification = new ReverseWordsInAString()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input              || output
        "the sky is blue"  || "blue is sky the"
    }
}
