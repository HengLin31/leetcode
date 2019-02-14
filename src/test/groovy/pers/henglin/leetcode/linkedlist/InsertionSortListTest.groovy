package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class InsertionSortListTest extends Specification{
    def "test InsertionSortList"() {
        given: "given InsertionSortList"
        Verification verification = new InsertionSortList()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        listNode.listNode2array(listNode.init(output as int[])) as int[] == listNode.listNode2array(verification.verify(listNode.init(input as int[]))) as int[]

        where: "input data set"
        input                 || output
        [4, 2, 1, 3]          || [1, 2, 3, 4]
        [-1, 5, 3, 4, 0]      || [-1, 0, 3, 4, 5]
    }
}
