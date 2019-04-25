package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class KthLargestElementInAnArrayTest extends Specification {
    def "test KthLargestElementInAnArray"(){
        setup: "setup KthLargestElementInAnArray"
        Verification verification = new KthLargestElementInAnArray()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                              || output
        [nums: [3, 2, 1, 5, 6, 4]          as int[], k: 2] || 5
        [nums: [3, 2, 3, 1, 2, 4, 5, 5, 6] as int[], k: 4] || 4

    }
}
