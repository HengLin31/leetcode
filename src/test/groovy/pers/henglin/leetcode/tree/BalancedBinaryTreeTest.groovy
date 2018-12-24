package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BalancedBinaryTreeTest extends Specification {
    def "test BalancedBinaryTree"() {
        setup: "setup BalancedBinaryTree"
        Verification verification = new BalancedBinaryTree()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                               || output
        [3, 9, 20, null, null, 15, 7]       || true
        [1, 2, 2, 3, 3, null, null, 4, 4]   || false
    }
}
