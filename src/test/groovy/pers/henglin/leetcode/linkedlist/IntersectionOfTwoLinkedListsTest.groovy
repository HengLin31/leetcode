package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class IntersectionOfTwoLinkedListsTest extends Specification{
    def "test IntersectionOfTwoLinkedLists"() {
        given: "given IntersectionOfTwoLinkedLists"
        Verification verification = new IntersectionOfTwoLinkedLists()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        result == verification.verify(listNode.mergeList(headA as int[], headB as int[], tail as int[]))

        where: "input data set"
        headA       | headB     | tail      || result
        [4, 1]      | [5, 0, 1] | [8, 4, 5] || 8
        [0, 9, 1]   | [3]       | [2, 4]    || 2
        [2, 6, 4]   | [1, 5]    | []        || null
    }
}
