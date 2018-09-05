package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class UniquePathsIITest extends Specification {
    def "test UniquePathsII"(){
        setup: "setup UniquePathsII"
        Verification verification = new UniquePathsII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                             || output
        [[0, 0, 0], [0, 1, 0], [0, 0, 0]] || 2
    }
}
