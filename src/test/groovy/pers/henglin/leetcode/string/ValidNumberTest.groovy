package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ValidNumberTest extends Specification {
    def "test ValidNumber"() {
        setup: "setup ValidNumber"
        Verification verification = new ValidNumber()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input       || output
        "0"         || true
        " 0.1 "     || true
        "abc"       || false
        "1 a"       || false
        "-2e10"     || true
        " -90e3   " || true
        " 1e"       || false
        "e3"        || false
        " 6e-1"     || true
        " 99e2.5 "  || false
        "53.5e93"   || true
        " --6 "     || false
        "-+3"       || false
        "95a54e53"  || false
    }
}
