package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

import java.util.Map;

public class RotateList implements Verification<Map, ListNode> {
    public ListNode rotateList(ListNode head, int k){
        if(null == head){
            return null;
        }
        ListNode temp = head;
        int listLenght = 0;
        while(temp != null){
            listLenght++;
            temp = temp.getNext();
        }

        k %= listLenght;

        if(k == 0){
            return head;
        }

        ListNode start;
        ListNode slow = head;
        ListNode fast = head;
        while(k != 0){
            fast = fast.getNext();
            k--;
        }
        while(fast.getNext() != null){ // fast will be the stop the last node NOT null
            fast = fast.getNext();
            slow = slow.getNext();
        }
        start = slow.getNext();
        slow.setNext(null); // cut the mid and create tail
        fast.setNext(head);
        return start;
    }

    @Override
    public ListNode verify(Map... input) {
        ListNode head = (ListNode) input[0].get("head");
        int k = (int) input[0].get("k");
        return rotateList(head, k);
    }
}
