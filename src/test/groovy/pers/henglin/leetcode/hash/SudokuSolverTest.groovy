package pers.henglin.leetcode.hash

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SudokuSolverTest extends Specification{
    def "test SudokuSolver"(){
        given: "given SudokuSolver"
        Verification verification = new SudokuSolver()

        expect: "verify result"
        verification.verify(input as String[]) == output as String[]

        where: "input data set"
        input                                                                                                                 || output
        ["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"] || ["534678912", "672195348", "198342567", "859761423", "426853791", "713924856", "961537284", "287419635", "345286179"]
    }
}
