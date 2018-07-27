package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

import java.util.Map;

public class ReverseNodesInKGroup implements Verification<Map, ListNode> {
    private ListNode reverseNodesInKGroup(ListNode head, int k){
        if(null == head){
            return null;
        }

        ListNode current = head;
        int count = 0;
        while(null != current && count != k){
            current = current.getNext();
            count++;
        }

        if(count == k){
            ListNode nextHead = reverseNodesInKGroup(current, k);
            while(count-- != 0){
                ListNode temp = head.getNext();
                head.setNext(nextHead);
                nextHead = head;
                head = temp;
            }
            head = nextHead;
        }
        return head;
    }

    private ListNode reverseNodesInKGroup2(ListNode head, int k){
        if(null == head || k == 1){
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.setNext(head);
        ListNode pre = newHead;

        int count = 0;
        ListNode point = head;
        while(null != point){
            count++;
            if(count % k == 0){
                pre = reverse(pre, point.getNext());
                point = pre.getNext();
            }else{
                point = point.getNext();
            }
        }
        return newHead.getNext();
    }

    private ListNode reverse(ListNode pre, ListNode next){
        ListNode last = pre.getNext();
        ListNode curr = last.getNext();

        while(curr != next){
            last.setNext(curr.getNext());
            curr.setNext(pre.getNext());
            pre.setNext(curr);
            curr = last.getNext();
        }

        return last;
    }

    @Override
    public ListNode verify(Map... input) {
        ListNode head = (ListNode) input[0].get("head");
        int k = (int) input[0].get("k");
        return reverseNodesInKGroup(head, k);
    }
}
