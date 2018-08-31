package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class RotateListTest  extends Specification {
    def "test RotateList"(){
        setup: "setup RotateList"
        Verification verification = new RotateList()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        def head = input["head"]
        input.put "head", listNode.init(head as int[])
        listNode.listNode2array(verification.verify(input)) as int[] == listNode.listNode2array(listNode.init(output as int[])) as int[]

        where: "input data set"
        input                            || output
        [head: [1, 2, 3, 4, 5] , k:  2]  || [4, 5, 1, 2, 3] //5->1->2->3->4->NULL => 4->5->1->2->3->NULL
        [head: [0, 1, 2] ,       k:  4]  || [2, 0, 1]       //2->0->1->NULL => 1->2->0->NULL => 0->1->2->NULL => 2->0->1->NULL
    }
}
