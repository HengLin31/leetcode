package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class LinkedListCycleIITest extends Specification{
    def "test LinkedListCycleII"() {
        given: "given LinkedListCycleII"
        Verification verification = new LinkedListCycleII()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        verification.verify(listNode.initHasCycle(head as int[], positon)) == result

        where: "input data set"
        head           | positon || result
        [3, 2, 0, -4]  | 1       || 2
        [1, 2]         | 0       || 1
        [1]            | -1      || -1
    }
}
