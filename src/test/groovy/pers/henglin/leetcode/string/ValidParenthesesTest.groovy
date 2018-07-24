package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ValidParenthesesTest extends Specification {
    def "test ValidParentheses"() {
        setup: "setup ValidParentheses"
        Verification verification = new ValidParentheses()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input               || output
        "()"                || true
        "()[]{}"            || true
        "(]"                || false
        "([)]"              || false
        "{[]}"              || true
    }
}
