package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/21.
 */
class MedianOfTwoSortedArraysTest extends Specification{
    def "test MedianOfTwoSortedArraysTest"(){
        setup: "setup MedianOfTwoSortedArraysTest"
        Verification medianOfTwoSortedArrays = new MedianOfTwoSortedArrays()

        expect: "verify result"
        medianOfTwoSortedArrays.verify(nums1 as Integer[] , nums2 as Integer[]) == output as Double

        where: "input data set"
        nums1  | nums2  || output
        [1, 3] | [2]    || 2.0
        [1, 2] | [3, 4] || 2.5

    }
}
