package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class ValidateBinarySearchTreeTest extends Specification {
    def "test ValidateBinarySearchTree"(){
        setup: "setup ValidateBinarySearchTree"
        Verification verification = new ValidateBinarySearchTree()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                       || output
        [2, 1, 3]                   || true
        [5, 1, 4, null, null, 3, 6] || false
    }
}
