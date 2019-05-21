package pers.henglin.leetcode.dp

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MaximalSquareTest extends Specification {
    def "test MaximalSquare"(){
        setup: "setup MaximalSquare"
        Verification verification = new MaximalSquare()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                                                              || output
        [matrix: [['1', '0', '1', '0', '0'], ['1', '0', '1', '1', '1'], ['1', '1', '1', '1', '1'], ['1', '0', '0', '1', '0']] as char[][]] || 4

    }
}
