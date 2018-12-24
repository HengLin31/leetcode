package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PathSumTest extends Specification {
    def "test PathSum"(){
        setup: "setup PathSum"
        Verification verification = new PathSum()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                 || output
        [root: [5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1] as Integer[] , sum: 22]  || true
    }
}
