package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class TriangleTest extends Specification {
    def "test Triangle"(){
        setup: "setup Triangle"
        Verification verification = new Triangle()

        expect: "verify result"
        verification.verify(input as List<List<Integer>>) == output

        where: "input data set"
        input                                   || output
        [[2], [3, 4], [6, 5, 7], [4, 1, 8, 3]]  || 11     // 2 + 3 + 5 + 1 = 11
    }
}
