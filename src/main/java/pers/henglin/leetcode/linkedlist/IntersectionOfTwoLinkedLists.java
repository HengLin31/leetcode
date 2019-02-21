package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class IntersectionOfTwoLinkedLists implements Verification<ListNode, Integer> {
    private ListNode intersectionOfTwoLinkedLists(ListNode headA, ListNode headB){
        if((null == headA) || (null == headB)){
            return null;
        }
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while(nodeA != nodeB){
            nodeA = (null == nodeA) ? headB : nodeA.getNext();
            nodeB = (null == nodeB) ? headA : nodeB.getNext();
        }
        return nodeA;
    }

    @Override
    public Integer verify(ListNode... input) {
        ListNode result = intersectionOfTwoLinkedLists(input[0], input[1]);
        return (null == result) ? null : result.getVal();
    }
}
