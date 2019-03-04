package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ExcelSheetColumnTitleTest extends Specification {
    def "test ExcelSheetColumnTitle"(){
        setup: "setup ExcelSheetColumnTitle"
        Verification verification = new ExcelSheetColumnTitle()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input || output
        1     || "A"
        28    || "AB"
        701   || "ZY"
    }
}
