package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MaximumSubarrayTest  extends Specification {
    def "test MaximumSubarray"() {
        setup: "setup MaximumSubarray"
        Verification verification = new MaximumSubarray()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                           || output
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] || 6        //Explanation: [4, -1, 2, 1]
    }
}
