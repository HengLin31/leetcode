package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class ReverseNodesInKGroupTest  extends Specification {
    def "test ReverseNodesInKGroup"(){
        setup: "setup ReverseNodesInKGroup"
        Verification verification = new ReverseNodesInKGroup()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        def head = input["head"]
        input.put "head", listNode.init(head as int[])
        listNode.listNode2array(verification.verify(input)) as int[] == listNode.listNode2array(listNode.init(output as int[])) as int[]

        where: "input data set"
        input                                  || output
        [head: [1, 2, 3, 4, 5] , k:  2]  || [2, 1, 4, 3, 5]
        [head: [1, 2, 3, 4, 5] , k:  3]  || [3, 2, 1, 4, 5]
    }
}
