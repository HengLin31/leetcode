package pers.henglin.leetcode.dp

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class DungeonGameTest extends Specification {
    def "test DungeonGame"(){
        setup: "setup DungeonGame"
        Verification verification = new DungeonGame()

        expect: "verify result"
        verification.verify(input as int[][], [[]] as int[][]) == output

        where: "input data set"
        input                                       || output
        [[-2, -3, 3], [-5, -10, 1], [10, 30, -5]]   || 7
    }
}
