package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ExcelSheetColumnNumberTest extends Specification {
    def "test ExcelSheetColumnNumber"(){
        setup: "setup ExcelSheetColumnNumber"
        Verification verification = new ExcelSheetColumnNumber()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input || output
        "A"   || 1
        "AB"  || 28
        "ZY"  || 701
    }
}
