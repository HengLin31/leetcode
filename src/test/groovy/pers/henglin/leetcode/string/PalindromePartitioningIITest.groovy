package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PalindromePartitioningIITest extends Specification {
    def "test PalindromePartitioningII"() {
        setup: "setup PalindromePartitioningII"
        Verification verification = new PalindromePartitioningII()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input || output
        "aab" || 1
    }
}
