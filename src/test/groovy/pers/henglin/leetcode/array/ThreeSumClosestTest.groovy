package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ThreeSumClosestTest extends Specification {
    def "test ThreeSumClosest"(){
        setup: "setup ThreeSumClosest"
        Verification verification = new ThreeSumClosest()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                              || output
        [nums: [-1, 2, 1, -4] as int[], target:  1]        || 2
    }
}
