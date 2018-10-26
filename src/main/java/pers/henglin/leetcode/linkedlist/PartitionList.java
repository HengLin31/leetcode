package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

import java.util.Map;

public class PartitionList implements Verification<Map, ListNode> {
    private ListNode partitionList(ListNode head, int x){
        ListNode newHead1 = new ListNode(0);
        ListNode newHead2 = new ListNode(0);

        ListNode current = head;
        ListNode small = newHead1;
        ListNode large = newHead2;

        while(null != current){
            if(current.getVal() < x){
                small.setNext(current);
                small = small.getNext();
            }else{
                large.setNext(current);
                large = large.getNext();
            }
            current = current.getNext();
        }
        large.setNext(null);//tail
        small.setNext(newHead2.getNext());//merge
        return newHead1.getNext();
    }

    @Override
    public ListNode verify(Map... input) {
        ListNode head = (ListNode) input[0].get("head");
        int x = (int) input[0].get("x");
        return partitionList(head, x);
    }
}
