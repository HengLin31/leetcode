package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/18.
 */
class TwoSumTest extends Specification {
    def "test two sum"(){
        setup: "setup two sum"
        Verification twoSum = new TwoSum()

        expect: "verify result"
        twoSum.verify(input) == output as Integer[]

        where: "input data set"
        input                                              || output
        [nums: [2, 7, 11, 15]   as Integer[], target:  9]  || [0, 1]
        [nums: [0, 4, 3, 0]     as Integer[], target:  0]  || [0, 3]
        [nums: [-1,-2,-3,-4,-5] as Integer[], target: -8]  || [2, 4]
    }
}
