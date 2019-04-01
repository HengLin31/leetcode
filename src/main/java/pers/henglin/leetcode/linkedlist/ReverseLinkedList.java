package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class ReverseLinkedList implements Verification<ListNode, ListNode> {
    private ListNode reverseLinkedList(ListNode head){
        ListNode prevNode = null;
        while(null != head){
            ListNode nextNode = head.getNext();
            head.setNext(prevNode);
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }

    @Override
    public ListNode verify(ListNode... input) {
        return reverseLinkedList(input[0]);
    }
}
