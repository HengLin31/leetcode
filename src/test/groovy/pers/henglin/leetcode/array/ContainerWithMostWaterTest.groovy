package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/28.
 */
class ContainerWithMostWaterTest extends Specification {
    def "test ContainerWithMostWater"(){
        setup: "setup ContainerWithMostWater"
        Verification verification = new ContainerWithMostWater()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                       || output
        [1, 1]                      || 1
        [1, 8, 6, 2, 5, 4, 8, 3, 7] || 49
    }
}
