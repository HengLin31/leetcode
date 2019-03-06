package pers.henglin.leetcode.tree

import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinarySearchTreeIteratorTest extends Specification {
    def "test BinarySearchTreeIterator"(){
        given: "create a new BinarySearchTreeIterator"
        def treeNodeData = [7, 3, 15, null, null, 9, 20] as Integer[]
        def iterator = new BinarySearchTreeIterator(TreeNode.initBinaryTreeByArray(treeNodeData))

        when: "next or hasNext"
        iterator.logNext()
        iterator.logNext()
        iterator.logHasNext()
        iterator.logNext()
        iterator.logHasNext()
        iterator.logNext()
        iterator.logHasNext()
        iterator.logNext()
        iterator.logHasNext()

        then: "check log"
        iterator.getOperationLog() == ["3", "7", "true" , "9", "true", "15", "true", "20", "false"]
    }
}
