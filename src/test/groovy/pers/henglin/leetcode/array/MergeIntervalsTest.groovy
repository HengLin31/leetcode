package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MergeIntervalsTest extends Specification {
    def "test MergeIntervals"(){
        setup: "setup MergeIntervals"
        Verification verification = new MergeIntervals()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                           || output
        [matrix: [[1, 3], [2, 6], [8, 10], [15, 18]]]   || [[1,6],[8,10],[15,18]]
        [matrix: [[1, 4], [4, 5]]]                      || [[1,5]]
    }
}
