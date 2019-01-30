package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CandyTest extends Specification {
    def "test Candy"(){
        setup: "setup Candy"
        Verification verification = new Candy()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input       || output
        [1, 0, 2]   || 5
        [1, 2, 2]   || 4
    }
}
