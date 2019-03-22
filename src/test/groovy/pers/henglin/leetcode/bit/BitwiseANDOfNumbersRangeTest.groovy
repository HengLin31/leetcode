package pers.henglin.leetcode.bit

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class BitwiseANDOfNumbersRangeTest extends Specification {
    def "test BitwiseANDOfNumbersRange"(){
        setup: "setup BitwiseANDOfNumbersRange"
        Verification verification = new BitwiseANDOfNumbersRange()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input   || output
        [5, 7]  || 4
        [0, 1]  || 0
    }
}
