package pers.henglin.leetcode.backtracking

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CombinationsTest  extends Specification {
    def "test Combinations"() {
        setup: "setup Combinations"
        Verification verification = new Combinations()

        expect: "verify result"
        verification.verify(input1, input2) == output

        where: "input data set"
        input1 | input2 || output
        4      | 2      || [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]] //[[2, 4], [3, 4], [2, 3], [1, 2], [1, 3], [1, 4]]
    }
}
