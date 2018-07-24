package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class MergeTwoSortedListsTest extends Specification{
    def "test MergeTwoSortedLists"() {
        given: "given MergeTwoSortedLists"
        Verification verification = new MergeTwoSortedLists()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        listNode.listNode2array(listNode.init(result as int[])) as int[] == listNode.listNode2array(verification.verify(listNode.init(l1 as int[]), listNode.init(l2 as int[]))) as int[]

        where: "input data set"
        l1        | l2        || result
        [1, 2, 4] | [1, 3, 4] || [1, 1, 2, 3, 4, 4]
    }
}
