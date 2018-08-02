package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SearchInRotatedSortedArrayTest extends Specification {
    def "test SearchInRotatedSortedArray"(){
        setup: "setup SearchInRotatedSortedArray"
        Verification verification = new SearchInRotatedSortedArray()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                     || output
        [nums: [4, 5, 6, 7, 0, 1, 2] as int[], target:  0]        || 4
        [nums: [4, 5, 6, 7, 0, 1, 2] as int[], target:  3]        || -1
    }
}
