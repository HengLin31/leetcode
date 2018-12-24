package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class MinimumDepthOfBinaryTreeTest extends Specification {
    def "test MinimumDepthOfBinaryTree"(){
        setup: "setup MinimumDepthOfBinaryTree"
        Verification verification = new MinimumDepthOfBinaryTree()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                           || output
        [3, 9, 20, null, null, 15, 7]   || 2
    }
}
