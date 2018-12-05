package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class RecoverBinarySearchTreeTest extends Specification {
    def "test RecoverBinarySearchTree"(){
        setup: "setup RecoverBinarySearchTree"
        Verification verification = new RecoverBinarySearchTree()

        expect: "verify result"
        TreeNode.isSame(verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])), TreeNode.initBinaryTreeByArray(output as Integer[]))

        where: "input data set"
        input                       || output
        [1, 3, null, null, 2]       || [3, 1, null, null, 2]
        [3, 1, 4, null, null, 2]    || [2, 1, 4, null, null, 3]
    }
}
