package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class UniquePathsTest extends Specification {
    def "test UniquePaths"(){
        setup: "setup UniquePaths"
        Verification verification = new UniquePaths()

        expect: "verify result"
        verification.verify(input[0], input[1]) == output

        where: "input data set"
        input   || output
        [3, 2]  || 3
        [7, 3]  || 28
    }
}
