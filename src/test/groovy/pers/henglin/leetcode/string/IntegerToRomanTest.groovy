package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/29.
 */
class IntegerToRomanTest extends Specification {
    def "test IntegerToRoman"(){
        setup: "setup IntegerToRoman"
        Verification verification = new IntegerToRoman()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        3       || "III"
        4       || "IV"
        9       || "IX"
        58      || "LVIII"
        1994    || "MCMXCIV"
    }
}
