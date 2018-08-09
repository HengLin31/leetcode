package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class TrappingRainWaterTest extends Specification {
    def "test TrappingRainWater"(){
        setup: "setup TrappingRainWater"
        Verification verification = new TrappingRainWater()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                                || output
        [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] || 6
    }
}
