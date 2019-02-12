package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class LinkedListCycleII implements Verification<ListNode, Integer> {
    private ListNode linkedListCycleII(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while((null != fast) && (null != fast.getNext())){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast){
                ListNode checkSlowPoint = head;
                while(checkSlowPoint != slow){
                    slow = slow.getNext();
                    checkSlowPoint = checkSlowPoint.getNext();
                }
                return slow;
            }
        }
        return null;
    }

    @Override
    public Integer verify(ListNode... input) {
        ListNode result = linkedListCycleII(input[0]);
        return null == result ? -1 : result.getVal();
    }
}
