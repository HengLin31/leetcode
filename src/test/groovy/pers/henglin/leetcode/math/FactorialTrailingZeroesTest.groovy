package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class FactorialTrailingZeroesTest  extends Specification {
    def "test FactorialTrailingZeroes"(){
        setup: "setup FactorialTrailingZeroes"
        Verification verification = new FactorialTrailingZeroes()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input || output
        3     || 0
        5     || 1
    }
}
