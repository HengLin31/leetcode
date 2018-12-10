package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinaryTreeZigzagLevelOrderTraversalTest extends Specification {
    def "test BinaryTreeZigzagLevelOrderTraversal"(){
        setup: "setup BinaryTreeZigzagLevelOrderTraversal"
        Verification verification = new BinaryTreeZigzagLevelOrderTraversal()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                           || output
        [3, 9, 20, null, null, 15, 7]   || [[3], [20, 9], [15, 7]]
    }
}
