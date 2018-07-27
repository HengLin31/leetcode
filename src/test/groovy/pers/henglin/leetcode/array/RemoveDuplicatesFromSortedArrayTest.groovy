package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class RemoveDuplicatesFromSortedArrayTest  extends Specification {
    def "test RemoveDuplicatesFromSortedArray"(){
        setup: "setup RemoveDuplicatesFromSortedArray"
        Verification verification = new RemoveDuplicatesFromSortedArray()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                          || output
        [1, 1, 2]                      || 2
        [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] || 5
    }
}
