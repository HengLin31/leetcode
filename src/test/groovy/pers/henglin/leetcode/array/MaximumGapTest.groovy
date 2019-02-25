package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MaximumGapTest extends Specification {
    def "test MaximumGap"() {
        setup: "setup MaximumGap"
        Verification verification = new MaximumGap()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input         || output
        [3, 6, 9, 1]  || 3
        [10]          || 0
    }
}
