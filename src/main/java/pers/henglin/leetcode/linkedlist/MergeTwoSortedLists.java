package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class MergeTwoSortedLists implements Verification<ListNode, ListNode> {
    private ListNode mergeTwoSortedLists(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode point = result;

        while (null != l1 && null != l2) {
            if (l1.getVal().compareTo(l2.getVal()) <= 0) {
                point.setNext(l1);
                l1 = l1.getNext();
            } else {
                point.setNext(l2);
                l2 = l2.getNext();
            }
            point = point.getNext();
        }
        if(null != l1){
            point.setNext(l1);
        }
        if(null != l2){
            point.setNext(l2);
        }
        return result.getNext();
    }

    @Override
    public ListNode verify(ListNode... input) {
        return mergeTwoSortedLists(input[0], input[1]);
    }
}
