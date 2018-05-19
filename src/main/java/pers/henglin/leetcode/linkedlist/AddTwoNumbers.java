package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

/**
 * Created by linheng on 2018/5/19.
 */
public class AddTwoNumbers implements Verification<ListNode, ListNode> {
    private ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode resultHead = new ListNode();
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;

        ListNode result = resultHead;
        int carry = 0;
        while((null != currentNode1) || (null != currentNode2)){
            //Set the value to zero if there is no value
            int val1 = (null == currentNode1) ? 0 : currentNode1.getVal();
            int val2 = (null == currentNode2) ? 0 : currentNode2.getVal();

            int sum = carry + val1 + val2;
            int remainder = sum % 10;
            carry = sum / 10;

            result.setNext(new ListNode(remainder));
            result = result.getNext();

            //find next node
            if(null != currentNode1){
                currentNode1 = currentNode1.getNext();
            }
            if(null != currentNode2){
                currentNode2 = currentNode2.getNext();
            }
        }

        if(carry > 0){
            result.setNext(new ListNode(carry));
        }

        return resultHead.getNext();
    }

    @Override
    public ListNode verify(ListNode... listNodes) {
        return addTwoNumbers(listNodes[0], listNodes[1]);
    }
}
