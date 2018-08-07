package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CombinationSumTest extends Specification {
    def "test CombinationSum"(){
        setup: "setup CombinationSum"
        Verification verification = new CombinationSum()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                  || output
        [candidates: [2, 3, 6, 7] as int[], target:  7]        || [[2, 2, 3], [7]]
        [candidates: [2, 3, 5]    as int[], target:  8]        || [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
    }
}
