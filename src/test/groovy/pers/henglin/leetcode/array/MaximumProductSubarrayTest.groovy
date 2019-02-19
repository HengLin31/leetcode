package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MaximumProductSubarrayTest extends Specification {
    def "test MaximumProductSubarray"() {
        setup: "setup MaximumProductSubarray"
        Verification verification = new MaximumProductSubarray()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input         || output
        [2, 3, -2, 4] || 6
        [-2, 0, -1]   || 0
    }
}
