package pers.henglin.leetcode.bit

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ReverseBitsTest extends Specification {
    def "test ReverseBits"(){
        setup: "setup ReverseBits"
        Verification verification = new ReverseBits()

        expect: "verify result"
        String.format("%032d", new  BigInteger(Integer.toBinaryString(verification.verify(Integer.parseInt(input, 2))))) == output

        where: "input data set"
        input                               || output
        "00000010100101000001111010011100"  || "00111001011110000010100101000000"
        "01111111111111111111111111111101"  || "10111111111111111111111111111110"
    }
}
