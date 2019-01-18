package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class LongestConsecutiveSequenceTest extends Specification {
    def "test LongestConsecutiveSequence"(){
        setup: "setup LongestConsecutiveSequence"
        Verification verification = new LongestConsecutiveSequence()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                   || output
        [100, 4, 200, 1, 3, 2]  || 4
    }
}
