package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinaryTreeInorderTraversalTest  extends Specification {
    def "test BinaryTreeInorderTraversal"() {
        setup: "setup BinaryTreeInorderTraversal"
        Verification verification = new BinaryTreeInorderTraversal()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input           || output
        [1, null, 2, 3] || [1, 3, 2]
    }
}
