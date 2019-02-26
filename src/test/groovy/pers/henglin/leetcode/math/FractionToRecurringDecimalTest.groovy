package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class FractionToRecurringDecimalTest extends Specification {
    def "test FractionToRecurringDecimal"(){
        setup: "setup FractionToRecurringDecimal"
        Verification verification = new FractionToRecurringDecimal()

        expect: "verify result"
        verification.verify(numerator, denominator) == output

        where: "input data set"
        numerator   | denominator     || output
        1           | 2               || "0.5"
        2           | 1               || "2"
        2           | 3               || "0.(6)"
    }
}
