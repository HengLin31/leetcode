package pers.henglin.leetcode.dp

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class HouseRobberIITest extends Specification {
    def "test HouseRobberII"(){
        setup: "setup HouseRobberII"
        Verification verification = new HouseRobberII()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input             || output
        [2, 3, 2]         || 3
        [1, 2, 3, 1]      || 4
    }
}
