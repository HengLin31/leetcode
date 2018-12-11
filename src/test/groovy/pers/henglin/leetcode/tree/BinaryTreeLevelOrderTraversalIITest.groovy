package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinaryTreeLevelOrderTraversalIITest extends Specification {
    def "test BinaryTreeLevelOrderTraversalII"(){
        setup: "setup BinaryTreeLevelOrderTraversalII"
        Verification verification = new BinaryTreeLevelOrderTraversalII()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                           || output
        [3, 9, 20, null, null, 15, 7]   || [[15, 7], [9, 20], [3]]
    }
}
