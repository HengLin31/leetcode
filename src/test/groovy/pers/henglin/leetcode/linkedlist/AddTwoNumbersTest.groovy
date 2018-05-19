package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.ListNode
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/19.
 */
class AddTwoNumbersTest extends Specification{
    def "test AddTwoNumbers"(){
        given: "given AddTwoNumbers"
        Verification addTwoNumbers = new AddTwoNumbers()
        ListNode listNode = new ListNode()//setup ListNode to build result set

        expect: "verify result"
        listNode.listNode2array(listNode.init(result as int[])) as int[] == listNode.listNode2array(addTwoNumbers.verify(listNode.init(l1 as int[]), listNode.init(l2 as int[]))) as int[]

        where: "input data set"
        l1        | l2        || result
        [2, 4, 3] | [5, 6, 4] || [7, 0, 8]
        [2, 4, 3] | [5, 6, 9] || [7, 0, 3, 1]
        [1, 2, 3] | [4]       || [5, 2, 3]
        [0, 4]    | [1, 2, 5] || [1, 6, 5]
    }
}
