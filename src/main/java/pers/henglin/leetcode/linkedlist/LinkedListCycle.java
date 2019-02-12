package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class LinkedListCycle implements Verification<ListNode, Boolean> {
    private boolean linkedListCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while((null != fast) && (null != fast.getNext())){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean verify(ListNode... input) {
        return linkedListCycle(input[0]);
    }
}
