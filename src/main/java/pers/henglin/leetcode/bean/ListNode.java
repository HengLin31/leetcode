package pers.henglin.leetcode.bean;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by linheng on 2018/5/19.
 */
public class ListNode {
    private static Integer NaN = Integer.MIN_VALUE;

    private int val;
    private ListNode next;

    public ListNode(){
        this(NaN);
    }

    public ListNode(int x){
        this.val = x;
    }

    public ListNode init(int[] array){
        if(array.length == 0){
            return new ListNode();
        }
        ListNode headNode = new ListNode(array[0]);
        ListNode currentNode = headNode;
        for(int index=1; index<array.length; index++){
            ListNode nextNode = new ListNode(array[index]);
            currentNode.setNext(nextNode);
            currentNode = nextNode;
        }
        return headNode;
    }

    public ListNode initHasCycle(int[] array, int cyclePosition){
        ListNode cycleListNode = init(array);
        ListNode head = cycleListNode;
        if(cyclePosition >= 0){
            while((null != cycleListNode) && (null != cycleListNode.getNext())){
                cycleListNode = cycleListNode.getNext();
            }
            ListNode tempNode = head;
            int index = 0;
            do{
                if(index == cyclePosition){
                    break;
                }
                tempNode = tempNode.getNext();
                index++;
            }while(null != tempNode.getNext());
            cycleListNode.setNext(tempNode);
        }
        return head;
    }

    public Integer[] listNode2array(ListNode listNode){
        List<Integer> results = new LinkedList<>();
        while(listNode != null){
            results.add(listNode.getVal());
            listNode = listNode.next;
        }
        return results.toArray(new Integer[results.size()]);
    }

    public ListNode[] mergeList(int[] arrayHead1, int[] arrayHead2, int[] arrayTail){
        ListNode listNode1 = init(arrayHead1);
        ListNode listNode2 = init(arrayHead2);

        ListNode tailNode1 = findLastNode(listNode1);
        ListNode tailNode2 = findLastNode(listNode2);

        for(int anArrayTail:arrayTail){
            ListNode newNode = new ListNode(anArrayTail);
            tailNode1.setNext(newNode);
            tailNode2.setNext(newNode);
            tailNode1 = tailNode1.getNext();
            tailNode2 = tailNode2.getNext();
        }

        return new ListNode[]{listNode1, listNode2};
    }

    private ListNode findLastNode(ListNode listNode){
        ListNode result = listNode;
        while(null != listNode){
            result = listNode;
            listNode = listNode.next;
        }
        return result;
    }

    public Integer getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
