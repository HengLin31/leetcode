package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MultiplyStringsTest extends Specification {
    def "test MultiplyStrings"() {
        setup: "setup MultiplyStrings"
        Verification verification = new MultiplyStrings()

        expect: "verify result"
        verification.verify(input1, input2) == output

        where: "input data set"
        input1 | input2 || output
        "2"    | "3"    || "6"
        "123"  | "456"  || "56088"
    }
}
