package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SpiralMatrixIITest extends Specification {
    def "test SpiralMatrixII"(){
        setup: "setup SpiralMatrixII"
        Verification verification = new SpiralMatrixII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input         || output
        3             || [[1, 2, 3], [8, 9, 4], [7, 6, 5]] as int[][]
    }
}
