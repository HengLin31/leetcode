package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SpiralMatrixTest extends Specification {
    def "test SpiralMatrix"(){
        setup: "setup SpiralMatrix"
        Verification verification = new SpiralMatrix()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                   || output
        [matrix: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]]             || [1, 2, 3, 6, 9, 8, 7, 4, 5]
        [matrix: [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]] || [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}
