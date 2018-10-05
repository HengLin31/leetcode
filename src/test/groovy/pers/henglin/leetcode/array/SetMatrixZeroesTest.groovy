package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SetMatrixZeroesTest extends Specification {
    def "test SetMatrixZeroes"(){
        setup: "setup SetMatrixZeroes"
        Verification verification = new SetMatrixZeroes()

        expect: "verify result"
        verification.verify(input) == output as int[][]

        where: "input data set"
        input                                       || output
        [[1, 1, 1], [1, 0, 1], [1, 1, 1]]           || [[1, 0, 1], [0, 0, 0], [1, 0, 1]]
        [[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]]  || [[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]
    }
}
