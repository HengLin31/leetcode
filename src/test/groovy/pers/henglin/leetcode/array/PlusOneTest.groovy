package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PlusOneTest extends Specification {
    def "test PlusOne"() {
        setup: "setup PlusOne"
        Verification verification = new PlusOne()

        expect: "verify result"
        verification.verify(input as Integer[]) == output as int[]

        where: "input data set"
        input        || output
        [1, 2, 3]    || [1, 2, 4]
        [4, 3, 2, 1] || [4, 3, 2, 2]
    }
}
