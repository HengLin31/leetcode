package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinaryTreePreorderTraversalTest extends Specification {
    def "test BinaryTreePreorderTraversal"(){
        setup: "setup BinaryTreePreorderTraversal"
        Verification verification = new BinaryTreePreorderTraversal()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input               || output
        [1, null, 2, 3]     || [1, 2, 3]
    }
}
