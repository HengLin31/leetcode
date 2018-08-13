package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PermutationsTest  extends Specification {
    def "test Permutations"() {
        setup: "setup Permutations"
        Verification verification = new Permutations()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input     || output
        [1, 2, 3] || [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    }
}
