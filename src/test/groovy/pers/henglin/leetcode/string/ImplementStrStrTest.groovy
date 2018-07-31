package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ImplementStrStrTest extends Specification {
    def "test ImplementStrStr"(){
        setup: "setup ImplementStrStr"
        Verification verification = new ImplementStrStr()

        expect: "verify result"
        verification.verify(input[0], input[1]) == output

        where: "input data set"
        input                   || output
        ["hello", "ll"]         || 2
        ["aaaaa", "bba"]        || -1
    }
}
