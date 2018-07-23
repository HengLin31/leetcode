package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

import java.util.Map;

public class RemoveNthNodeFromEndOfList implements Verification<Map, ListNode> {
    private ListNode removeNthNodeFromEndOfList(ListNode head, int n){
        ListNode fast = head;
        ListNode slow = head;
        for(int index=0; index<n; index++){
            fast = fast.getNext();
        }
        if(null == fast){
            return head.getNext();
        }
        while(null != fast.getNext()){
            fast = fast.getNext();
            slow = slow.getNext();
        }
        slow.setNext(slow.getNext().getNext());
        return head;
    }

    @Override
    public ListNode verify(Map... input) {
        Map parmas = input[0];
        ListNode head = (ListNode) parmas.get("head");
        int n = (int) parmas.get("n");
        return removeNthNodeFromEndOfList(head, n);
    }
}
