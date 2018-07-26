package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class SwapNodesInPairs implements Verification<ListNode, ListNode> {
    private ListNode swapNodesInPairs(ListNode head){
        if(null == head){
            return null;
        }
        ListNode newHead = new ListNode(0);
        newHead.setNext(head);
        ListNode current = newHead;
        while(null != current.getNext() && null != current.getNext().getNext()){
            ListNode first = current.getNext();
            ListNode second = current.getNext().getNext();
            first.setNext(second.getNext());
            second.setNext(first);
            current.setNext(second);
            //current.next.next is next first;
            current = current.getNext().getNext();
        }
        return newHead.getNext();
    }

    private ListNode swapNodesInPairs2(ListNode head){
        if(null == head || null == head.getNext()){
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.setNext(head);
        ListNode current = newHead;

        while(null != current.getNext() && null != current.getNext().getNext()){
            ListNode first = current;
            current = current.getNext();
            first.setNext(current.getNext());

            ListNode second = current.getNext().getNext();
            current.getNext().setNext(current);
            current.setNext(second);
        }

        return newHead.getNext();
    }

    @Override
    public ListNode verify(ListNode... input) {
        return swapNodesInPairs(input[0]);
    }
}
