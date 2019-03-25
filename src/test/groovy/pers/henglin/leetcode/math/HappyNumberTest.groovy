package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class HappyNumberTest extends Specification {
    def "test HappyNumber"(){
        setup: "setup HappyNumber"
        Verification verification = new HappyNumber()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input || output
        19    || true
    }
}
