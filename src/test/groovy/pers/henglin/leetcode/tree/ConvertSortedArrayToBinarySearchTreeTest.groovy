package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class ConvertSortedArrayToBinarySearchTreeTest extends Specification {
    def "test ConvertSortedArrayToBinarySearchTree"(){
        setup: "setup ConvertSortedArrayToBinarySearchTree"
        Verification verification = new ConvertSortedArrayToBinarySearchTree()

        expect: "verify result"
        TreeNode.isSame(verification.verify(input as Integer[]), TreeNode.initBinaryTreeByArray(output as Integer[]))

        where: "input data set"
        input                || output
        [-10, -3, 0, 5, 9]   || [0, -10, 5, null, -3, null, 9]
    }
}
