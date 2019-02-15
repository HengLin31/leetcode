package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.Point
import spock.lang.Specification

class MaxPointsOnALineTest extends Specification {
    def "test MaxPointsOnALine"(){
        setup: "setup MaxPointsOnALine"
        Verification verification = new MaxPointsOnALine()

        expect: "verify result"
        verification.verify(Point.initPoints(input as int[][]) as Point[]) == output

        where: "input data set"
        input                                               || output
        [[1, 1], [2, 2], [3, 3]]                            || 3
        [[1, 1], [3, 2], [5, 3], [4, 1], [2, 3], [1, 4]]    || 4
        [[0,0], [94911151, 94911150], [94911152, 94911151]] || 2
    }
}
