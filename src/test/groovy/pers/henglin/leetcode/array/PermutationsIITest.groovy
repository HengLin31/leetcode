package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PermutationsIITest  extends Specification {
    def "test PermutationsII"() {
        setup: "setup PermutationsII"
        Verification verification = new PermutationsII()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input     || output
        [1, 1, 2] || [[1, 1, 2], [1, 2, 1], [2, 1, 1]]
    }
}
