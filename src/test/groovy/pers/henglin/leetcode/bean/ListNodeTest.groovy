package pers.henglin.leetcode.bean

import spock.lang.Specification

/**
 * Created by linheng on 2018/5/19.
 */
class ListNodeTest extends Specification {
    def "test ListNode"(){
        given: "given ListNode"
        ListNode listNode = new ListNode()
        int[] initVals = [10, 20, 30]
        def result = []

        when: "init ListNode by array"
        ListNode node = listNode.init(initVals)
        while(node != null){
            result.add(node.getVal())
            node = node.next
        }

        then: "test ListNode structure"
        initVals == result as int[]
    }
}
