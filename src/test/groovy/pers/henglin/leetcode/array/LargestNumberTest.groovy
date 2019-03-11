package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class LargestNumberTest extends Specification {
    def "test LargestNumber"(){
        setup: "setup LargestNumber"
        Verification verification = new LargestNumber()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input               || output
        [10, 2]             || "210"
        [3, 30, 34, 5, 9]   || "9534330"
    }
}