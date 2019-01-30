package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SingleNumberTest extends Specification {
    def "test SingleNumber"(){
        setup: "setup SingleNumber"
        Verification verification = new SingleNumber()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input           || output
        [2, 2, 1]       || 1
        [4, 1, 2, 1, 2] || 4
    }
}
