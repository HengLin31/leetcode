package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest extends Specification {
    def "test ConstructBinaryTreeFromPreorderAndInorderTraversal"(){
        setup: "setup ConstructBinaryTreeFromPreorderAndInorderTraversal"
        Verification verification = new ConstructBinaryTreeFromPreorderAndInorderTraversal()

        expect: "verify result"
        TreeNode.isSame(verification.verify(preorder as int[], inorder as int[]), TreeNode.initBinaryTreeByArray(output as Integer[]))

        where: "input data set"
        preorder            | inorder             || output
        [3, 9, 20, 15, 7]   | [9, 3, 15, 20, 7]   || [3, 9, 20, null, null, 15, 7]
    }
}
