package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class WordLadderTest extends Specification {
    def "test WordLadder"(){
        setup: "setup WordLadder"
        Verification verification = new WordLadder()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                      || output
        [beginWord: "hit" , endWord: "cog", wordList: ["hot", "dot", "dog", "lot", "log", "cog"]]  || 5
        [beginWord: "hit" , endWord: "cog", wordList: ["hot", "dot", "dog", "lot", "log"]]         || 0
    }
}
