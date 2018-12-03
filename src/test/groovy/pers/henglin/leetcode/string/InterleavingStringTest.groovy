package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class InterleavingStringTest extends Specification {
    def "test InterleavingString"(){
        setup: "setup InterleavingString"
        Verification verification = new InterleavingString()

        expect: "verify result"
        verification.verify(input1, input2, input3) == output

        where: "input data set"
        input1  | input2  | input3          || output
        "aabcc" | "dbbca" | "aadbbcbcac"    || true
        "aabcc" | "dbbca" | "aadbbbaccc"    || false
    }
}
