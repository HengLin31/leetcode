package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class JumpGameTest extends Specification {
    def "test JumpGame"(){
        setup: "setup JumpGame"
        Verification verification = new JumpGame()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input            || output
        [2, 3, 1, 1, 4]  || true
        [3, 2, 1, 0, 4]  || false
    }
}
