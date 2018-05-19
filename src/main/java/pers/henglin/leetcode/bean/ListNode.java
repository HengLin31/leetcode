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

    public Integer[] listNode2array(ListNode listNode){
        List<Integer> results = new LinkedList<>();
        while(listNode != null){
            results.add(listNode.getVal());
            listNode = listNode.next;
        }
        return results.toArray(new Integer[results.size()]);
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
