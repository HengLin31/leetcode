package pers.henglin.leetcode.linkedlist;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;

public class MergeKSortedLists implements Verification<ListNode, ListNode> {
    private ListNode mergeKSortedLists(ListNode[] lists){
        return partition(lists,0,lists.length - 1);
    }

    private ListNode partition(ListNode[] lists,int start, int end){
        if(start == end){
            return lists[start];
        }
        if(start < end){
            int mid = start + ( end - start ) / 2;
            ListNode list1 = partition(lists , start ,mid);
            ListNode list2 = partition(lists , mid + 1, end);
            return merge(list1, list2);
        }else{
            return null;
        }
    }

    private ListNode merge(ListNode list1,ListNode list2){
        if(null == list1){
            return list2;
        }
        if(null == list2){
            return list1;
        }
        if(list1.getVal() < list2.getVal()){
            list1.setNext(merge(list1.getNext(), list2));
            return list1;
        }else{
            list2.setNext(merge(list1, list2.getNext()));
            return list2;
        }
    }

    @Override
    public ListNode verify(ListNode... input) {
        return mergeKSortedLists(input);
    }
}
