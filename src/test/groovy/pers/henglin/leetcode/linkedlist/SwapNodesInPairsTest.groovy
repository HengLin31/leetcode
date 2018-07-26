package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

class SwapNodesInPairsTest  extends Specification{
    def "test SwapNodesInPairs"(){
        given: "given SwapNodesInPairs"
        Verification verification = new SwapNodesInPairs()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        listNode.listNode2array(listNode.init(output as int[])) as int[] == listNode.listNode2array(verification.verify(listNode.init(input as int[]))) as int[]

        where: "input data set"
        input        || output
        [1, 2, 3, 4] || [2, 1, 4, 3]

    }
}
