package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class FindMinimumInRotatedSortedTest extends Specification {
    def "test FindMinimumInRotatedSorted"(){
        setup: "setup FindMinimumInRotatedSorted"
        Verification verification = new FindMinimumInRotatedSorted()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                   || output
        [3, 4, 5, 1, 2]         || 1
        [4, 5, 6, 7, 0, 1, 2]   || 0
    }
}
