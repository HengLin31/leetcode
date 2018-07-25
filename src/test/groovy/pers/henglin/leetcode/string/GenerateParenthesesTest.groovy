package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class GenerateParenthesesTest extends Specification {
    def "test GenerateParentheses"(){
        setup: "setup GenerateParentheses"
        Verification verification = new GenerateParentheses()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        3       || ["((()))", "(()())", "(())()", "()(())", "()()()"]

    }
}
