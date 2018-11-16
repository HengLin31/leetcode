package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MergeSortedArrayTest extends Specification {
    def "test MergeSortedArray"(){
        setup: "setup MergeSortedArray"
        Verification verification = new MergeSortedArray()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                               || output
        [nums1: [1, 2, 3, 0, 0, 0] as int[], m: 3, nums2: [2, 5, 6] as int[], n: 3]  || [1, 2, 2, 3, 5, 6] as int[]
    }
}
