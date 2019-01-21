package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SurroundedRegionsTest extends Specification {
    def "test SurroundedRegions"(){
        setup: "setup SurroundedRegions"
        Verification verification = new SurroundedRegions()

        expect: "verify result"
        verification.verify(input as String[]) == output

        where: "input data set"
        input                             || output
        ["XXXX", "XOOX", "XXOX", "XOXX"]  || ["XXXX", "XXXX", "XXXX", "XOXX"]
    }
}
