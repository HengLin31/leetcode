package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class SumRootToLeafNumbersTest extends Specification {
    def "test SumRootToLeafNumbers"(){
        setup: "setup SumRootToLeafNumbers"
        Verification verification = new SumRootToLeafNumbers()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input           || output
        [1, 2, 3]       || 25
        [4, 9, 0, 5, 1] || 1026
    }
}
