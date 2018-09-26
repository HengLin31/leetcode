package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class AddBinaryTest extends Specification {
    def "test AddBinary"(){
        setup: "setup AddBinary"
        Verification verification = new AddBinary()

        expect: "verify result"
        verification.verify(input[0], input[1]) == output

        where: "input data set"
        input             || output
        ["11", "1"]       || "100"
        ["1010", "1011"]  || "10101"
    }
}
