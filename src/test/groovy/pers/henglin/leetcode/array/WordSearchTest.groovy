package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class WordSearchTest extends Specification {
    def "test WordSearch"(){
        setup: "setup WordSearch"
        Verification verification = new WordSearch()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                                    || output
        [board: [['A', 'B', 'C', 'E'], ['S', 'F', 'C', 'S'], ['A', 'D', 'E', 'E']] as char[][], word: "ABCCED"]  || true
        [board: [['A', 'B', 'C', 'E'], ['S', 'F', 'C', 'S'], ['A', 'D', 'E', 'E']] as char[][], word: "SEE"]     || true
        [board: [['A', 'B', 'C', 'E'], ['S', 'F', 'C', 'S'], ['A', 'D', 'E', 'E']] as char[][], word: "ABCB"]    || false
    }
}
