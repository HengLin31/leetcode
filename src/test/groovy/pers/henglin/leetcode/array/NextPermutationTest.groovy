package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class NextPermutationTest  extends Specification {
    def "test NextPermutation"() {
        setup: "setup NextPermutation"
        Verification verification = new NextPermutation()

        expect: "verify result"
        verification.verify(input as Integer[]) == output as int[]

        where: "input data set"
        input     || output
        [1, 2, 3] || [1, 3, 2]
        [3, 2, 1] || [1, 2, 3]
        [1, 1, 5] || [1, 5, 1]
    }
}
