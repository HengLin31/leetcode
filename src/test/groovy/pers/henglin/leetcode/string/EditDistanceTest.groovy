package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class EditDistanceTest extends Specification {
    def "test EditDistance"(){
        setup: "setup EditDistance"
        Verification verification = new EditDistance()

        expect: "verify result"
        verification.verify(input[0], input[1]) == output

        where: "input data set"
        input                       || output
        ["horse", "ros"]            || 3
        ["intention", "execution"]  || 5
    }
}
