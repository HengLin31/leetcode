package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.RandomListNode;


public class CopyListWithRandomPointer implements Verification<RandomListNode, RandomListNode> {
    private RandomListNode copyListWithRandomPointer(RandomListNode head){
        if(null == head){
            return null;
        }
        RandomListNode copyNode = new RandomListNode(0);
        RandomListNode currentNode = copyNode;
        while(null != head){
            currentNode.next = new RandomListNode(head.label);
            if(null != head.random){
                currentNode.next.random = new RandomListNode(head.random.label);
            }
            currentNode = currentNode.next;
            head = head.next;
        }
        return copyNode.next;
    }

    @Override
    public RandomListNode verify(RandomListNode... input) {
        return copyListWithRandomPointer(input[0]);
    }
}
