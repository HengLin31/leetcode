package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MajorityElementTest extends Specification {
    def "test MajorityElement"() {
        setup: "setup MajorityElement"
        Verification verification = new MajorityElement()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                   || output
        [3, 2, 3]               || 3
        [2, 2, 1, 1, 1, 2, 2]   || 2
    }
}
