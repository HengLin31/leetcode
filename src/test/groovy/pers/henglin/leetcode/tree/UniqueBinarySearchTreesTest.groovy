package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class UniqueBinarySearchTreesTest extends Specification {
    def "test UniqueBinarySearchTrees"(){
        setup: "setup UniqueBinarySearchTrees"
        Verification verification = new UniqueBinarySearchTrees()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input   || output
        3       || 5

    }
}
