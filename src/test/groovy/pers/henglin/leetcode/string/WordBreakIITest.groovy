package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class WordBreakIITest extends Specification {
    def "test WordBreakII"(){
        setup: "setup WordBreakII"
        Verification verification = new WordBreakII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                   || output
        [s: "catsanddog",        wordDict: ["cat", "cats", "and", "sand", "dog"]]               || ["cat sand dog", "cats and dog"]
        [s: "pineapplepenapple", wordDict: ["apple", "pen", "applepen", "pine", "pineapple"]]   || ["pine apple pen apple", "pine applepen apple", "pineapple pen apple"]
        [s: "catsandog",         wordDict: ["cats", "dog", "sand", "and", "cat"]]               || []
    }
}
