package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class ReorderList implements Verification<ListNode, ListNode> {
    private void reorderList(ListNode head){
        if((null == head) || (null == head.getNext())){
            return;
        }
        ListNode middleNode = findMiddleNode(head);
        ListNode leftNode = head;
        ListNode rightNode = reverseListNode(middleNode);
        int count = 1;
        while((null != leftNode) && (null != rightNode) && (leftNode != rightNode)){
            if(0 != (count % 2)){
                ListNode tempNode = leftNode.getNext();
                leftNode.setNext(rightNode);
                leftNode = tempNode;
            }else{
                ListNode tempNode = rightNode.getNext();
                rightNode.setNext(leftNode);
                rightNode = tempNode;
            }
            count++;
        }
    }

    private ListNode findMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while((null != fast) && (null != fast.getNext())){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    private ListNode reverseListNode(ListNode head){
        if((null == head) || (null == head.getNext())){
            return head;
        }
        ListNode preNode = head;
        ListNode currentNode = head.getNext();
        while(null != currentNode){
            ListNode tmp = currentNode.getNext();
            currentNode.setNext(preNode);
            preNode = currentNode;
            currentNode = tmp;
        }
        head.setNext(null);
        return preNode;
    }

    @Override
    public ListNode verify(ListNode... input) {
        ListNode head = input[0];
        reorderList(head);
        return head;
    }
}
