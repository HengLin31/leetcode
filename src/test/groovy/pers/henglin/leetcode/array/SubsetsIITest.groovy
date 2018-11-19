package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SubsetsIITest extends Specification {
    def "test SubsetsII"() {
        setup: "setup SubsetsII"
        Verification verification = new Subsets()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input     || output
        [1, 2, 2] || [[], [1], [1, 2], [1, 2, 2], [1, 2], [2], [2, 2], [2]]
    }
}
