package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class RotateArrayTest extends Specification {
    def "test RotateArray"(){
        setup: "setup RotateArray"
        Verification verification = new RotateArray()

        expect: "verify result"
        verification.verify(input) == output as int[]

        where: "input data set"
        input                                          || output
        [nums: [1, 2, 3, 4, 5, 6, 7] as int[], k:  3]  || [5,6,7,1,2,3,4]
        [nums: [-1, -100, 3, 99] as int[],     k:  2]  || [3,99,-1,-100]
    }
}
