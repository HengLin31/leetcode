package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PathSumIITest extends Specification {
    def "test PathSumII"(){
        setup: "setup PathSumII"
        Verification verification = new PathSumII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                              || output
        [root: [5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1] as Integer[] , sum: 22]  || [[5, 4, 11, 2], [5, 8, 4, 5]]
    }
}
