package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class RemoveElementTest extends Specification {
    def "test RemoveElement"(){
        setup: "setup RemoveElement"
        Verification verification = new RemoveElement()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                              || output
        [nums: [3, 2, 2, 3] as int[], val:  3]             || 2
        [nums: [0,1,2,2,3,0,4,2] as int[], val:  2]        || 5
    }
}
