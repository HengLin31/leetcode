package pers.henglin.leetcode.bit

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class NumberOf1BitsTest extends Specification {
    def "test NumberOf1Bits"(){
        setup: "setup NumberOf1Bits"
        Verification verification = new NumberOf1Bits()

        expect: "verify result"
        verification.verify(Integer.parseInt(input, 2)) == output

        where: "input data set"
        input                               || output
        "00000000000000000000000000001011"  || 3
        "00000000000000000000000010000000"  || 1
        "01111111111111111111111111111111"  || 31
    }
}
