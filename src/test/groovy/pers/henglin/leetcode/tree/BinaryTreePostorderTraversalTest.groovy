package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinaryTreePostorderTraversalTest extends Specification {
    def "test BinaryTreePostorderTraversal"(){
        setup: "setup BinaryTreePostorderTraversal"
        Verification verification = new BinaryTreePostorderTraversal()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input               || output
        [1, null, 2, 3]     || [3, 2, 1]
    }
}
