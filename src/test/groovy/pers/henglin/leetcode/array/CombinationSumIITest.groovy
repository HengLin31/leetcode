package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CombinationSumIITest extends Specification {
    def "test CombinationSumII"(){
        setup: "setup CombinationSumII"
        Verification verification = new CombinationSumII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                       || output
        [candidates: [10, 1, 2, 7, 6, 1, 5] as int[], target:  8]   || [[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
        [candidates: [2, 5, 2, 1, 2]        as int[], target:  5]   || [[1, 2, 2], [5]]
    }
}
