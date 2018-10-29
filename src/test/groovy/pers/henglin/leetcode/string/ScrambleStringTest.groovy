package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ScrambleStringTest extends Specification {
    def "test ScrambleString"(){
        setup: "setup ScrambleString"
        Verification verification = new ScrambleString()

        expect: "verify result"
        verification.verify(input[0], input[1]) == output

        where: "input data set"
        input              || output
        ["great", "rgeat"] || true
        ["abcde", "caebd"] || false
    }
}
