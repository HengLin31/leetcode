package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SearchInsertPositionTest extends Specification {
    def "test SearchInsertPosition"(){
        setup: "setup SearchInsertPosition"
        Verification verification = new SearchInsertPosition()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                            || output
        [nums: [1, 3, 5, 6] as int[], target:  5]        || 2
        [nums: [1, 3, 5, 6] as int[], target:  2]        || 1
        [nums: [1, 3, 5, 6] as int[], target:  7]        || 4
        [nums: [1, 3, 5, 6] as int[], target:  0]        || 0
    }
}
