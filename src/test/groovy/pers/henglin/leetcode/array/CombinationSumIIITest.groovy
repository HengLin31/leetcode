package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CombinationSumIIITest extends Specification {
    def "test CombinationSumIII"(){
        setup: "setup CombinationSumIII"
        Verification verification = new CombinationSumIII()

        expect: "verify result"
        verification.verify(k, n) == output

        where: "input data set"
        k   | n   || output
        3   | 7   || [[1, 2, 4]]
        3   | 9   || [[1, 2, 6], [1, 3, 5], [2, 3, 4]]
    }
}
