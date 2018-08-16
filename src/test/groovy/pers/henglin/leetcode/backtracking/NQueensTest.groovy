package pers.henglin.leetcode.backtracking

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class NQueensTest extends Specification {
    def "test NQueens"(){
        setup: "setup NQueens"
        Verification verification = new NQueens()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        4       || [[".Q..", "...Q", "Q...", "..Q."], ["..Q.", "Q...", "...Q", ".Q.."]]
    }
}
