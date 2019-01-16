package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class WordLadderIITest extends Specification {
    def "test WordLadderII"(){
        setup: "setup WordLadderII"
        Verification verification = new WordLadderII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                      || output
        [beginWord: "hit" , endWord: "cog", wordList: ["hot", "dot", "dog", "lot", "log", "cog"]]  || [["hit", "hot", "dot", "dog", "cog"], ["hit", "hot", "lot", "log", "cog"]]
        [beginWord: "hit" , endWord: "cog", wordList: ["hot", "dot", "dog", "lot", "log"]]         || []
    }
}
