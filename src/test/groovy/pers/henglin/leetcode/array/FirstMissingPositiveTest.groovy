package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class FirstMissingPositiveTest extends Specification {
    def "test FirstMissingPositive"(){
        setup: "setup FirstMissingPositive"
        Verification verification = new FirstMissingPositive()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input               || output
        [1, 2, 0]           || 3
        [3, 4, -1, 1]       || 2
        [7, 8, 9, 11, 12]   || 1
    }
}
