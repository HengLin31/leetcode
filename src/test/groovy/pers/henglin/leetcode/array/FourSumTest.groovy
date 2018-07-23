package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class FourSumTest extends Specification {
    def "test FourSum"(){
        setup: "setup FourSum"
        Verification verification = new FourSum()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                    || output
        [nums: [1, 0, -1, 0, -2, 2] as int[], target:  0]        || [[1, 2, -2, -1], [0, 2, -2, 0], [0, 1, -1, 0]]
    }
}
