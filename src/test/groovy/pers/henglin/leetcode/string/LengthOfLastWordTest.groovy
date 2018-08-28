package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class LengthOfLastWordTest extends Specification {
    def "test LengthOfLastWord"(){
        setup: "setup LengthOfLastWord"
        Verification verification = new LengthOfLastWord()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input           || output
        "Hello World"   || 5
    }
}
