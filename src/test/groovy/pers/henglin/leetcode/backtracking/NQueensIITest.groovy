package pers.henglin.leetcode.backtracking

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class NQueensIITest extends Specification {
    def "test NQueensII"(){
        setup: "setup NQueensII"
        Verification verification = new NQueensII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        4       || 2
    }
}
