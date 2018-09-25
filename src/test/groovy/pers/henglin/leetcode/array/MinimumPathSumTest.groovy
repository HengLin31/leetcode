package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class MinimumPathSumTest extends Specification {
    def "test MinimumPathSum"(){
        setup: "setup MinimumPathSum"
        Verification verification = new MinimumPathSum()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                             || output
        [[1, 3, 1], [1, 5, 1], [4, 2, 1]] || 7
    }
}
