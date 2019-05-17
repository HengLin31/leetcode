package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ContainsDuplicateIITest extends Specification {
    def "test ContainsDuplicateII"(){
        setup: "setup ContainsDuplicateII"
        Verification verification = new ContainsDuplicateII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input  || output
        [nums: [1, 2, 3, 1] as int[], k: 3]       || true
        [nums: [1, 0, 1, 1] as int[], k: 1]       || true
        [nums: [1, 2, 3, 1, 2, 3] as int[], k: 2] || false
    }
}
