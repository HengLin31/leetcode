package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class DistinctSubsequencesTest extends Specification {
    def "test DistinctSubsequences"(){
        setup: "setup DistinctSubsequences"
        Verification verification = new DistinctSubsequences()

        expect: "verify result"
        verification.verify(input[0], input[1]) == output

        where: "input data set"
        input                  || output
        ["rabbbit", "rabbit"]  || 3
        ["babgbag", "bag"]     || 5
    }
}
