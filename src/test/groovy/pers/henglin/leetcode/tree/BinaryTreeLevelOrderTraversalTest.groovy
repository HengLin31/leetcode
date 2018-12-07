package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinaryTreeLevelOrderTraversalTest extends Specification {
    def "test BinaryTreeLevelOrderTraversal"(){
        setup: "setup BinaryTreeLevelOrderTraversal"
        Verification verification = new BinaryTreeLevelOrderTraversal()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                           || output
        [3, 9, 20, null, null, 15, 7]   || [[3], [9, 20], [15, 7]]
    }
}
