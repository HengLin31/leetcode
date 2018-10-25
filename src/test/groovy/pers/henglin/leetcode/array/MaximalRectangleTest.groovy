package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MaximalRectangleTest extends Specification {
    def "test MaximalRectangle"(){
        setup: "setup MaximalRectangle"
        Verification verification = new MaximalRectangle()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                                                              || output
        [matrix: [['1', '0', '1', '0', '0'], ['1', '0', '1', '1', '1'], ['1', '1', '1', '1', '1'], ['1', '0', '0', '1', '0']] as char[][]] || 6

    }
}
