package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SubsetsTest   extends Specification {
    def "test Subsets"() {
        setup: "setup Subsets"
        Verification verification = new Subsets()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input     || output
        [1, 2, 3] || [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
    }
}
