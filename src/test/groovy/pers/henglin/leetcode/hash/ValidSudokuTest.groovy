package pers.henglin.leetcode.hash

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ValidSudokuTest extends Specification{
    def "test ValidSudokuTest"(){
        given: "given ValidSudokuTest"
        Verification verification = new ValidSudoku()

        expect: "verify result"
        verification.verify(input as String[]) == output

        where: "input data set"
        input                                                                                                                 || output
        ["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"] || true
        ["83..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"] || false
    }
}
