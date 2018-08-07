package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CountAndSayTest extends Specification {
    def "test CountAndSay"(){
        setup: "setup CountAndSay"
        Verification verification = new CountAndSay()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        1       || "1"
        2       || "11"
        3       || "21"
        4       || "1211"
        5       || "111221"
    }
}
