package pers.henglin.leetcode.dp

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ClimbingStairsTest extends Specification {
    def "test ClimbingStairs"(){
        setup: "setup ClimbingStairs"
        Verification verification = new ClimbingStairs()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input || output
        2     || 2
        3     || 3
        4     || 5
        5     || 8
        6     || 13

    }
}
