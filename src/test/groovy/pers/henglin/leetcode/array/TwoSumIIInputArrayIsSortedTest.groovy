package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class TwoSumIIInputArrayIsSortedTest extends Specification {
    def "test TwoSumIIInputArrayIsSorted"(){
        setup: "setup TwoSumIIInputArrayIsSorted"
        Verification verification = new TwoSumIIInputArrayIsSorted()

        expect: "verify result"
        verification.verify(input) == output as int[]

        where: "input data set"
        input                                              || output
        [numbers: [2, 7, 11, 15] as int[], target:  9] || [1, 2]
    }
}
