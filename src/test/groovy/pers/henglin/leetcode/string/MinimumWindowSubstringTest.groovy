package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MinimumWindowSubstringTest extends Specification {
    def "test MinimumWindowSubstring"() {
        setup: "setup MinimumWindowSubstring"
        Verification verification = new MinimumWindowSubstring()

        expect: "verify result"
        verification.verify(input1, input2) == output

        where: "input data set"
        input1          | input2    || output
        "ADOBECODEBANC" | "ABC"     || "BANC"
    }
}
