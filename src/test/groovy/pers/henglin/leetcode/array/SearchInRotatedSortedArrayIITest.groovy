package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SearchInRotatedSortedArrayIITest extends Specification {
    def "test SearchInRotatedSortedArrayII"(){
        setup: "setup SearchInRotatedSortedArrayII"
        Verification verification = new SearchInRotatedSortedArrayII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                     || output
        [nums: [2, 5, 6, 0, 0, 1, 2] as int[], target:  0]        || true
        [nums: [2, 5, 6, 0, 0, 1, 2] as int[], target:  3]        || false
    }
}
