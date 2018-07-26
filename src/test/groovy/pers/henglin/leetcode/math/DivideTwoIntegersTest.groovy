package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class DivideTwoIntegersTest  extends Specification {
    def "test DivideTwoIntegers"(){
        setup: "setup DivideTwoIntegers"
        Verification verification = new DivideTwoIntegers()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input   || output
        [10, 3] || 3
        [7, -3] || -2

    }
}
