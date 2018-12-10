package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class ConstructBinaryTreeFromInorderAndPostorderTraversalTest extends Specification {
    def "test ConstructBinaryTreeFromInorderAndPostorderTraversal"(){
        setup: "setup ConstructBinaryTreeFromInorderAndPostorderTraversal"
        Verification verification = new ConstructBinaryTreeFromInorderAndPostorderTraversal()

        expect: "verify result"
        TreeNode.isSame(verification.verify(inorder as int[], postorder as int[]), TreeNode.initBinaryTreeByArray(output as Integer[]))

        where: "input data set"
        inorder             | postorder           || output
        [9, 3, 15, 20, 7]   | [9, 15, 7, 20, 3]   || [3, 9, 20, null, null, 15, 7]
    }
}
