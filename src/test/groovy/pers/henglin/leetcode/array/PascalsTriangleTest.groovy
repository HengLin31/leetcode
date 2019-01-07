package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PascalsTriangleTest extends Specification {
    def "test PascalsTriangle"() {
        setup: "setup PascalsTriangle"
        Verification verification = new PascalsTriangle()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        5       || [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
    }
}
