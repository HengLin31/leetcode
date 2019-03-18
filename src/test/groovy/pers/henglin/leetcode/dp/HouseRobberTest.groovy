package pers.henglin.leetcode.dp

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class HouseRobberTest extends Specification {
    def "test HouseRobber"(){
        setup: "setup HouseRobber"
        Verification verification = new HouseRobber()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input             || output
        [1, 2, 3, 1]      || 4
        [2, 7, 9, 3, 1]   || 12
    }
}
