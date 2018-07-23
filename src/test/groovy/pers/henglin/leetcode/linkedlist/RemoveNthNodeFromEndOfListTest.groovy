package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class RemoveNthNodeFromEndOfListTest extends Specification{
    def "test RemoveNthNodeFromEndOfList"(){
        given: "given RemoveNthNodeFromEndOfList"
        Verification verification = new RemoveNthNodeFromEndOfList()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        def head = input["head"]
        input.put "head", listNode.init(head as int[])
        listNode.listNode2array(listNode.init(output as int[])) as int[] == listNode.listNode2array(verification.verify(input)) as int[]

        where: "input data set"
        input                                    || output
        [head: [1, 2, 3, 4, 5] as int[], n:  2]  || [1, 2, 3, 5]
    }
}
