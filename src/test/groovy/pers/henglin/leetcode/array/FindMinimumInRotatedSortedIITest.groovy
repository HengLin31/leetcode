package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class FindMinimumInRotatedSortedIITest extends Specification {
    def "test FindMinimumInRotatedSortedII"(){
        setup: "setup FindMinimumInRotatedSortedII"
        Verification verification = new FindMinimumInRotatedSortedII()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input             || output
        [1, 3, 5]         || 1
        [2, 2, 2, 0, 1]   || 0
    }
}
