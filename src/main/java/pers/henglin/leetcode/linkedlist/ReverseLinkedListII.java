package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

import java.util.Map;

public class ReverseLinkedListII implements Verification<Map, ListNode> {
    private ListNode reverseLinkedListII(ListNode head, int m, int n){
        if(m == n){
            return head;
        }
        int index = 1;
        ListNode newHead = new ListNode(0);
        newHead.setNext(head);

        ListNode cur = head;
        ListNode pre = newHead;

        while(index < m){
            cur = cur.getNext();
            pre = pre.getNext();
            index++;
        }

        while(index < n){
            ListNode tmp = pre.getNext();
            pre.setNext(cur.getNext());
            cur.setNext(cur.getNext().getNext());
            pre.getNext().setNext(tmp);
            index++;
        }

        return newHead.getNext();
    }

    @Override
    public ListNode verify(Map... input) {
        Map params = input[0];
        ListNode head = (ListNode) params.get("head");
        int m = (int) params.get("m");
        int n = (int) params.get("n");
        return reverseLinkedListII(head, m, n);
    }
}
