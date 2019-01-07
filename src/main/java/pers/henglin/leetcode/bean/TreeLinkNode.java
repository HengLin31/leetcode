package pers.henglin.leetcode.bean;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLinkNode {
    private static int maxLevel = 0;

    private Integer value;
    private TreeLinkNode left;
    private TreeLinkNode right;
    private TreeLinkNode next;

    public TreeLinkNode(Integer value){
        this.value = value;
        this.left = null;
        this.right = null;
        this.next = null;
    }

    public Integer getValue() {
        return value;
    }

    public TreeLinkNode getLeft() {
        return left;
    }

    public TreeLinkNode getRight() {
        return right;
    }

    public TreeLinkNode getNext() {
        return next;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setLeft(TreeLinkNode left) {
        this.left = left;
    }

    public void setRight(TreeLinkNode right) {
        this.right = right;
    }

    public void setNext(TreeLinkNode next) {
        this.next = next;
    }

    /*
        It's binary tree for leetcode version.
     */
    public static TreeLinkNode initBinaryTreeByArray(Integer[] arr){
        if(0 == arr.length){
            return null;
        }
        Queue<TreeLinkNode> queue = new LinkedList<>();
        TreeLinkNode head = new TreeLinkNode(arr[0]);
        queue.add(head);

        int index = 1;
        while(index < arr.length){
            TreeLinkNode node = queue.poll();
            if(arr[index] != null){
                node.left = new TreeLinkNode(arr[index]);
                queue.add(node.left);
            }
            if((index + 1 < arr.length) && (arr[index + 1] != null)){
                node.right = new TreeLinkNode(arr[index + 1]);
                queue.add(node.right);
            }
            index += 2;
        }
        return head;
    }

    private static void findLeftNode(List<TreeLinkNode> treeLinkNodes, TreeLinkNode treeLinkNode, int level){
        if(null == treeLinkNode){
            return;
        }
        //first tree node of it's level
        if(maxLevel < level){
            treeLinkNodes.add(treeLinkNode);
            maxLevel = level;
        }
        findLeftNode(treeLinkNodes, treeLinkNode.getLeft(), level + 1);
        findLeftNode(treeLinkNodes, treeLinkNode.getRight(), level + 1);
    }

    public static List<Integer> buildTreeNextList(TreeLinkNode treeLinkNode){
        maxLevel = 0;
        List<TreeLinkNode> leftNodes = new LinkedList<>();
        findLeftNode(leftNodes, treeLinkNode, 1);
        List<Integer> result = new LinkedList<>();
        for(TreeLinkNode leftNode:leftNodes){
            TreeLinkNode tempNode = leftNode;
            while(null != tempNode){
                result.add(tempNode.getValue());
                tempNode = tempNode.getNext();
            }
            result.add(null);
        }
        return result;
    }
}
