package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class PermutationSequenceTest  extends Specification {
    def "test PermutationSequence"(){
        setup: "setup PermutationSequence"
        Verification verification = new PermutationSequence()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input   || output
        [3, 3]  || "213"
        [4, 9]  || "2314"
    }
}
