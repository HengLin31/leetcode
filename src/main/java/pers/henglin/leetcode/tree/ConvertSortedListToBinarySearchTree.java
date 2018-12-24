package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.ListNode;
import pers.henglin.leetcode.bean.TreeNode;

public class ConvertSortedListToBinarySearchTree implements Verification<ListNode, TreeNode> {
    private ListNode newHead;

    private TreeNode convertSortedListToBinarySearchTree(ListNode head){
        int size = listSize(head);
        this.newHead = head;
        return list2bst(0, size - 1);
    }

    private int listSize(ListNode head) {
        ListNode current = head;
        int count = 0;
        while(null != current){
            current = current.getNext();
            count++;
        }
        return count;
    }

    private TreeNode list2bst(int left, int right) {
        if(left > right){
            return null;
        }
        int middle = (left + right) / 2;
        TreeNode leftNode = this.list2bst(left, middle - 1);
        TreeNode node = new TreeNode(this.newHead.getVal());
        node.setLeft(leftNode);
        this.newHead = this.newHead.getNext();
        node.setRight(this.list2bst(middle + 1, right));
        return node;
    }

    @Override
    public TreeNode verify(ListNode... input) {
        return convertSortedListToBinarySearchTree(input[0]);
    }
}
