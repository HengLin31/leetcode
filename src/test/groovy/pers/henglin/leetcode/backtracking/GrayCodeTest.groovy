package pers.henglin.leetcode.backtracking

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class GrayCodeTest  extends Specification {
    def "test GrayCode"() {
        setup: "setup GrayCode"
        Verification verification = new GrayCode()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input || output
        2     || [0, 1, 3, 2]
    }
}
