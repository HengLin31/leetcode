package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/23.
 */
class ZigZagConversionTest extends Specification {
    def "test ZigZagConversion"(){
        setup: "setup ZigZagConversion"
        Verification verification = new ZigZagConversion()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                              || output
        [str: "PAYPALISHIRING" , numRows:  3]  || "PAHNAPLSIIGYIR"
        [str: "PAYPALISHIRING" , numRows:  4]  || "PINALSIGYAHRPI"
    }
}
