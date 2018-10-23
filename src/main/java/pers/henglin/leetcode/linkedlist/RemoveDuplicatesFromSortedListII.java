package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class RemoveDuplicatesFromSortedListII implements Verification<ListNode, ListNode> {
    private ListNode removeDuplicatesFromSortedListII(ListNode head){
        if((null == head) || (null == head.getNext())){
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.setNext(head);
        ListNode slow = newHead;
        ListNode fast = head;
        boolean duplicate = false;

        while(null != fast){
            int current = slow.getNext().getVal();
            while((null != fast.getNext()) && (fast.getNext().getVal() == current)){
                duplicate = true;
                fast = fast.getNext();
            }
            if(duplicate){
                slow.setNext(fast.getNext());
                duplicate = false;
            }else{
                slow = slow.getNext();
            }
            fast = slow.getNext();
        }
        return newHead.getNext();
    }

    @Override
    public ListNode verify(ListNode... input) {
        return removeDuplicatesFromSortedListII(input[0]);
    }
}
