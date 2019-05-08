package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class TheSkylineProblemTest extends Specification {
    def "test TheSkylineProblem"(){
        setup: "setup TheSkylineProblem"
        Verification verification = new TheSkylineProblem()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                            || output
        [[2, 9, 10], [3, 7, 15], [5, 12, 12], [15, 20, 10], [19, 24, 8]] || [[2, 10], [3, 15], [7, 12], [12, 0], [15, 10], [20, 8], [24, 0]]
    }
}
