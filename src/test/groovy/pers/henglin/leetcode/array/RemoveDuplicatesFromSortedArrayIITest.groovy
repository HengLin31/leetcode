package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class RemoveDuplicatesFromSortedArrayIITest  extends Specification {
    def "test RemoveDuplicatesFromSortedArrayII"() {
        setup: "setup RemoveDuplicatesFromSortedArrayII"
        Verification verification = new RemoveDuplicatesFromSortedArrayII()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                       || output
        [1, 1, 1, 2, 2, 3]          || 5
        [0, 0, 1, 1, 1, 1, 2, 3, 3] || 7
    }
}
