package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class NumberOfIslandsTest extends Specification {
    def "test NumberOfIslands"() {
        setup: "setup NumberOfIslands"
        Verification verification = new NumberOfIslands()

        expect: "verify result"
        verification.verify(input as String[]) == output

        where: "input data set"
        input                                || output
        ["11110", "11010", "11000", "00000"] || 1
        ["11000", "11000", "00100", "00011"] || 3
    }
}
