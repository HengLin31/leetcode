package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class SortList implements Verification<ListNode, ListNode> {
    private ListNode sortList(ListNode head){
        if((null == head) || (null == head.getNext())){
            return head;
        }
        ListNode slowNode = head;
        ListNode fastNode = head;
        ListNode preNode = null;
        while((null != fastNode) && (null !=  fastNode.getNext())){
            preNode = slowNode;
            slowNode = slowNode.getNext();
            fastNode = fastNode.getNext().getNext();
        }
        preNode.setNext(null);
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(slowNode);
        return merge(head1, head2);
    }

    private ListNode merge(ListNode head1, ListNode head2){
        if(null == head1){
            return head2;
        }
        if(null == head2){
            return head1;
        }
        if(head1.getVal() <= head2.getVal()){
            head1.setNext(merge(head1.getNext(), head2));
            return head1;
        }else{
            return merge(head2, head1);
        }
    }

    @Override
    public ListNode verify(ListNode... input) {
        return sortList(input[0]);
    }
}
