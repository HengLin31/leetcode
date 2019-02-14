package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class InsertionSortList implements Verification<ListNode, ListNode> {
    private ListNode insertionSortList(ListNode head){
        if((null == head) || (null == head.getNext())){
            return head;
        }
        ListNode resultNode = new ListNode(Integer.MIN_VALUE);
        resultNode.setNext(head);
        ListNode headNode = resultNode;
        ListNode pointNode = head;
        ListNode pointNodeNext = head.getNext();
        while(null != pointNodeNext){
            if(pointNodeNext.getVal() >= pointNode.getVal()){
                pointNodeNext = pointNodeNext.getNext();
                pointNode = pointNode.getNext();
            }else{
                ListNode pointNodeNextNext = pointNodeNext.getNext();
                pointNode.setNext(null);
                insert(headNode, pointNode, pointNodeNext);
                pointNode.setNext(pointNodeNextNext);
                pointNodeNext = pointNodeNextNext;
            }
        }
        return resultNode.getNext();
    }

    private void insert(ListNode headNode, ListNode tailNode, ListNode currentNode) {
        if(null == currentNode){
            return;
        }
        ListNode pointNode = headNode;
        ListNode pointNodeNext = headNode.getNext();
        while((pointNodeNext.getVal() < currentNode.getVal()) && (pointNodeNext != tailNode)){
            pointNode = pointNodeNext;
            pointNodeNext = pointNodeNext.getNext();
        }
        currentNode.setNext(pointNodeNext);
        pointNode.setNext(currentNode);
    }

    @Override
    public ListNode verify(ListNode... input) {
        return insertionSortList(input[0]);
    }
}
