package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class FindFirstAndLastPositionOfElementInSortedArrayTest extends Specification {
    def "test FindFirstAndLastPositionOfElementInSortedArray"(){
        setup: "setup FindFirstAndLastPositionOfElementInSortedArray"
        Verification verification = new FindFirstAndLastPositionOfElementInSortedArray()

        expect: "verify result"
        verification.verify(input) == output as int[]

        where: "input data set"
        input                                                     || output
        [nums: [5, 7, 7, 8, 8, 10] as int[], target:  8]        || [3, 4]
        [nums: [5, 7, 7, 8, 8, 10] as int[], target:  6]        || [-1, -1]
    }
}
