package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class ReorderListTest extends Specification{
    def "test ReorderList"() {
        given: "given ReorderList"
        Verification verification = new ReorderList()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        listNode.listNode2array(listNode.init(output as int[])) as int[] == listNode.listNode2array(verification.verify(listNode.init(input as int[]))) as int[]

        where: "input data set"
        input           || output
        [1, 2, 3, 4]    || [1, 4, 2, 3]
        [1, 2, 3, 4, 5] || [1, 5, 2, 4, 3]
    }
}
