package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class LinkedListCycleTest extends Specification{
    def "test LinkedListCycle"() {
        given: "given LinkedListCycle"
        Verification verification = new LinkedListCycle()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        verification.verify(listNode.initHasCycle(head as int[], positon)) == result

        where: "input data set"
        head           | positon || result
        [3, 2, 0, -4]  | 1       || true
        [1, 2]         | 0       || true
        [1]            | -1      || false
    }
}
