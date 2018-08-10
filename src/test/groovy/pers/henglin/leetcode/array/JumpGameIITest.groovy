package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class JumpGameIITest extends Specification {
    def "test JumpGameII"(){
        setup: "setup JumpGameII"
        Verification verification = new JumpGameII()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input            || output
        [2, 3, 1, 1, 4]  || 2
    }
}
