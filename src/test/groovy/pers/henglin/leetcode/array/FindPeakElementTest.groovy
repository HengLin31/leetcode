package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class FindPeakElementTest extends Specification {
    def "test FindPeakElement"(){
        setup: "setup FindPeakElement"
        Verification verification = new FindPeakElement()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                   || output
        [1, 2, 3, 1]            || 2
        [1, 2, 1, 3, 5, 6, 4]   || 5
    }
}
