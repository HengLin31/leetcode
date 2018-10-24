package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class RemoveDuplicatesFromSortedListTest extends Specification{
    def "test RemoveDuplicatesFromSortedList"() {
        given: "given RemoveDuplicatesFromSortedList"
        Verification verification = new RemoveDuplicatesFromSortedList()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        listNode.listNode2array(listNode.init(output as int[])) as int[] == listNode.listNode2array(verification.verify(listNode.init(input as int[]))) as int[]

        where: "input data set"
        input           || output
        [1, 1, 2]       || [1, 2]
        [1, 1, 2, 3, 3] || [1, 2, 3]
    }
}
