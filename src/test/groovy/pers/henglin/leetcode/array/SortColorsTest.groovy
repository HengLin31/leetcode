package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SortColorsTest extends Specification {
    def "test SortColors"(){
        setup: "setup SortColors"
        Verification verification = new SortColors()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input              || output
        [2, 0, 2, 1, 1, 0] || [0, 0, 1, 1, 2, 2]
    }
}
