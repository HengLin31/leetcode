package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class PartitionListTest extends Specification{
    def "test PartitionList"(){
        given: "given PartitionList"
        Verification verification = new PartitionList()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        def head = input["head"]
        input.put "head", listNode.init(head as int[])
        listNode.listNode2array(listNode.init(output as int[])) as int[] == listNode.listNode2array(verification.verify(input)) as int[]

        where: "input data set"
        input                                       || output
        [head: [1, 4, 3, 2, 5, 2] as int[], x:  3]  || [1, 2, 2, 4, 3, 5]
    }
}
