package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class GasStationTest extends Specification {
    def "test GasStation"(){
        setup: "setup GasStation"
        Verification verification = new GasStation()

        expect: "verify result"
        verification.verify(gas as int[], cost as int[]) == output

        where: "input data set"
        gas             | cost            || output
        [1, 2, 3, 4, 5] | [3, 4, 5, 1, 2] || 3
        [2, 3, 4]       | [3, 4, 3]       || -1
    }
}
