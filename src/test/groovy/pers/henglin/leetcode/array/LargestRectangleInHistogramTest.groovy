package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class LargestRectangleInHistogramTest extends Specification {
    def "test LargestRectangleInHistogram"(){
        setup: "setup LargestRectangleInHistogram"
        Verification verification = new LargestRectangleInHistogram()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input               || output
        [2, 1, 5, 6, 2, 3]  || 10
    }
}
