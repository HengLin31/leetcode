package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class MergeKSortedListsTest extends Specification{
    def "test MergeKSortedLists"() {
        given: "given MergeKSortedLists"
        Verification verification = new MergeKSortedLists()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        def lists = []
        input.each { ele ->
            lists.add(listNode.init(ele as int[]))
        }

        listNode.listNode2array(listNode.init(output as int[])) as int[] == listNode.listNode2array(verification.verify(lists as ListNode[])) as int[]

        where: "input data set"
        input                          || output
        [[1, 4, 5], [1, 3, 4], [2, 6]] || [1, 1, 2, 3, 4, 4, 5, 6]
    }
}
