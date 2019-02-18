package pers.henglin.leetcode.stack

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class EvaluateReversePolishNotationTest extends Specification {
    def "test EvaluateReversePolishNotation"(){
        setup: "setup EvaluateReversePolishNotation"
        Verification verification = new EvaluateReversePolishNotation()

        expect: "verify result"
        verification.verify(input as String[]) == output

        where: "input data set"
        input                                                                   || output
        ["2", "1", "+", "3", "*"]                                               || 9
        ["4", "13", "5", "/", "+"]                                              || 6
        ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]   || 22

    }
}
