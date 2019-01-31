package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SingleNumberIITest extends Specification {
    def "test SingleNumberII"(){
        setup: "setup SingleNumberII"
        Verification verification = new SingleNumberII()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                   || output
        [2, 2, 3, 2]            || 3
        [0, 1, 0, 1, 0, 1, 99]  || 99
    }
}
