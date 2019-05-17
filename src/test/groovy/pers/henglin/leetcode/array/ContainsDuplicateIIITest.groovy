package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class ContainsDuplicateIIITest extends Specification {
    def "test ContainsDuplicateIII"(){
        setup: "setup ContainsDuplicateIII"
        Verification verification = new ContainsDuplicateIII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input  || output
        [nums: [1, 2, 3, 1] as int[], k: 3, t: 0]       || true
        [nums: [1, 0, 1, 1] as int[], k: 1, t: 2]       || true
        [nums: [1, 5, 9, 1, 5, 9] as int[], k: 2, t: 3] || false
    }
}
