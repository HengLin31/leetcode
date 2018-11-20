package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class DecodeWaysTest extends Specification {
    def "test DecodeWays"(){
        setup: "setup DecodeWays"
        Verification verification = new DecodeWays()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input  || output
        "12"   || 2
        "226"  || 3
    }
}
