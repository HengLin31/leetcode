package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/31.
 */
class RomanToIntegerTest extends Specification {
    def "test RomanToInteger"() {
        setup: "setup RomanToInteger"
        Verification somanToInteger = new RomanToInteger()

        expect: "verify result"
        somanToInteger.verify(input) == output

        where: "input data set"
        input       || output
        "III"       || 3
        "IV"        || 4
        "IX"        || 9
        "LVIII"     || 58
        "MCMXCIV"   || 1994
    }
}
