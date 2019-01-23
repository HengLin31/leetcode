package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PalindromePartitioningTest extends Specification {
    def "test PalindromePartitioning"() {
        setup: "setup PalindromePartitioning"
        Verification verification = new PalindromePartitioning()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input || output
        "aab" || [["a", "a", "b"], ["aa", "b"]]
    }
}
