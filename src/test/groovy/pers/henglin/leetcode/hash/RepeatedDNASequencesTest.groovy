package pers.henglin.leetcode.hash

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class RepeatedDNASequencesTest extends Specification{
    def "test RepeatedDNASequences"(){
        given: "given RepeatedDNASequences"
        Verification verification = new RepeatedDNASequences()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                              || output
        "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT" || ["AAAAACCCCC", "CCCCCAAAAA"]
    }
}
