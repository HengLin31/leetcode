package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class RemoveDuplicatesFromSortedList implements Verification<ListNode, ListNode> {
    private ListNode removeDuplicatesFromSortedList(ListNode head){
        if(null == head){
            return head;
        }
        ListNode node = head;
        ListNode nextNode = head.getNext();
        while(null != nextNode){
            if(node.getVal().equals(nextNode.getVal())){
                node.setNext(nextNode.getNext());
                nextNode = nextNode.getNext();
            }else{
                node = node.getNext();
            }
        }
        return head;
    }

    @Override
    public ListNode verify(ListNode... input) {
        return removeDuplicatesFromSortedList(input[0]);
    }
}
