package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PascalsTriangleIITest extends Specification {
    def "test PascalsTriangleII"() {
        setup: "setup PascalsTriangleII"
        Verification verification = new PascalsTriangleII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        3       || [1, 3, 3, 1]
    }
}
