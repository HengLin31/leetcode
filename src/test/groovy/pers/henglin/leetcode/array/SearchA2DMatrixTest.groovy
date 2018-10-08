package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SearchA2DMatrixTest extends Specification {
    def "test SearchA2DMatrix"(){
        setup: "setup SearchA2DMatrix"
        Verification verification = new SearchA2DMatrix()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                   || output
        [matrix: [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50]] as int[][], target:  3]     || true
        [matrix: [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50]] as int[][], target:  13]    || false
    }
}
