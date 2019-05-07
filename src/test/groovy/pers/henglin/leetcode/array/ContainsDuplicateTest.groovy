package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ContainsDuplicateTest extends Specification {
    def "test ContainsDuplicate"(){
        setup: "setup ContainsDuplicate"
        Verification verification = new ContainsDuplicate()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                           || output
        [1, 2, 3, 1]                    || true
        [1, 2, 3, 4]                    || false
        [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]  || true
    }
}
