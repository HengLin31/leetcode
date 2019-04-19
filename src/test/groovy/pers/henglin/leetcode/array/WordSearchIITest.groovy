package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class WordSearchIITest extends Specification {
    def "test WordSearchII"(){
        setup: "setup WordSearchII"
        Verification verification = new WordSearchII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                                                                                         || output
        [board: [['o', 'a', 'a', 'n'], ['e', 't', 'a', 'e'], ['i', 'h', 'k', 'r'], ['i', 'f', 'l', 'v']] as char[][], words: ["oath","pea","eat","rain"] as String[]] || ["oath", "eat"]
    }
}
