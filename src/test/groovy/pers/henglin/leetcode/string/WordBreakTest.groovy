package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class WordBreakTest extends Specification {
    def "test WordBreak"(){
        setup: "setup WordBreak"
        Verification verification = new WordBreak()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                   || output
        [s: "leetcode",      wordDict: ["leet", "code"]]                        || true
        [s: "applepenapple", wordDict: ["apple", "pen"]]                        || true
        [s: "catsandog",     wordDict: ["cats", "dog", "sand", "and", "cat"]]   || false
    }
}
