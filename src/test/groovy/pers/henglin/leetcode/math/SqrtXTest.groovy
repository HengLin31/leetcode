package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SqrtXTest  extends Specification {
    def "test SqrtX"(){
        setup: "setup SqrtX"
        Verification verification = new SqrtX()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        4       || 2
        8       || 2
    }
}
