package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ThreeSumTest extends Specification {
    def "test ThreeSum"(){
        setup: "setup ThreeSum"
        Verification verification = new ThreeSum()

        expect: "verify result"
        verification.verify(input as Integer[][]) == output

        where: "input data set"
        input                    || output
        [[-1, 0, 1, 2, -1, -4]]  || [[-1, -1, 2], [-1, 0, 1]]
    }
}
