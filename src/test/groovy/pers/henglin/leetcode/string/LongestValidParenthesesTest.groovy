package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class LongestValidParenthesesTest extends Specification {
    def "test LongestValidParentheses"() {
        setup: "setup LongestValidParentheses"
        Verification verification = new LongestValidParentheses()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input       || output
        "(()"       || 2        //()
        ")()())"    || 4        //()()
    }
}
