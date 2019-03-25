package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

import java.util.Map;

public class RemoveLinkedListElements implements Verification<Map, ListNode> {
    private ListNode removeLinkedListElements(ListNode head, int val){
        ListNode result = new ListNode(-1);
        result.setNext(head);

        ListNode current = head;
        ListNode prev = result;
        while(null != current){
            if(val == current.getVal()){
                prev.setNext(current.getNext());
            }else{
                prev = prev.getNext();
            }
            current = current.getNext();
        }
        return result.getNext();
    }

    @Override
    public ListNode verify(Map... input) {
        ListNode head = (ListNode) input[0].get("head");
        int val = (int) input[0].get("val");
        return removeLinkedListElements(head, val);
    }
}
