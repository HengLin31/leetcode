package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CountPrimesTest  extends Specification {
    def "test CountPrimes"(){
        setup: "setup CountPrimes"
        Verification verification = new CountPrimes()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        10      || 4
    }
}
