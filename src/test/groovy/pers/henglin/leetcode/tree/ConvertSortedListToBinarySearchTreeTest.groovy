package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class ConvertSortedListToBinarySearchTreeTest extends Specification {
    def "test ConvertSortedListToBinarySearchTree"(){
        setup: "setup ConvertSortedListToBinarySearchTree"
        Verification verification = new ConvertSortedListToBinarySearchTree()
        ListNode listNode = new ListNode()

        expect: "verify result"
        TreeNode.isSame(verification.verify(listNode.init(input as int[])), TreeNode.initBinaryTreeByArray(output as Integer[]))

        where: "input data set"
        input                || output
        [-10, -3, 0, 5, 9]   || [0, -10, 5, null, -3, null, 9]
    }
}
