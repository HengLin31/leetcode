package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class InsertIntervalTest extends Specification {
    def "test InsertInterval"(){
        setup: "setup InsertInterval"
        Verification verification = new InsertInterval()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                        || output
        [matrix: [[1, 3], [6, 9]],                            newInterval: [2, 5]]   || [[1, 5], [6, 9]]
        [matrix: [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]], newInterval: [4, 8]]   || [[1, 2], [3, 10],[12, 16]]
    }
}
