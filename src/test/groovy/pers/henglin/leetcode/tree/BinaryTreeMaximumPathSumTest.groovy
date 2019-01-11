package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinaryTreeMaximumPathSumTest extends Specification {
    def "test BinaryTreeMaximumPathSum"(){
        setup: "setup BinaryTreeMaximumPathSum"
        Verification verification = new BinaryTreeMaximumPathSum()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                           || output
        [1, 2, 3]                       || 6
        [-10, 9, 20, null, null, 15, 7] || 42
    }
}
