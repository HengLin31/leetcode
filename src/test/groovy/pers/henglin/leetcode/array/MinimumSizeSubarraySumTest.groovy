package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MinimumSizeSubarraySumTest extends Specification {
    def "test MinimumSizeSubarraySum"() {
        setup: "setup MinimumSizeSubarraySum"
        Verification verification = new MinimumSizeSubarraySum()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                   || output
        [s: 7, nums:  [2,3,1,2,4,3] as int[] ]  || 2
    }
}
