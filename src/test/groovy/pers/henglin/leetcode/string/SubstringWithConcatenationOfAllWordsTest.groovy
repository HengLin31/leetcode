package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SubstringWithConcatenationOfAllWordsTest extends Specification {
    def "test SubstringWithConcatenationOfAllWords"(){
        setup: "setup SubstringWithConcatenationOfAllWords"
        Verification verification = new SubstringWithConcatenationOfAllWords()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                       || output
        [s: "barfoothefoobarman" , words: ["foo", "bar"]]           || [0, 9]
        [s: "wordgoodstudentgoodword" , words: ["word","student"]]  || []
    }
}
