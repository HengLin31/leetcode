package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class FlattenBinaryTreeToLinkedListTest extends Specification {
    def "test FlattenBinaryTreeToLinkedList"(){
        setup: "setup FlattenBinaryTreeToLinkedList"
        Verification verification = new FlattenBinaryTreeToLinkedList()

        expect: "verify result"
        TreeNode.isSame(verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])), TreeNode.initBinaryTreeByArray(output as Integer[]))

        where: "input data set"
        input                      || output
        [1, 2, 5, 3, 4, null, 6]   || [1, null, 2, null, 3, null, 4, null, 5, null, 6]
    }
}
