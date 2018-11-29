package pers.henglin.leetcode.bean;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    private Integer value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Integer value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Integer getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public static TreeNode initBinarySearchTreeByArray(Integer[] arr){
        if(0 == arr.length){
            return null;
        }
        TreeNode root = null;
        for(int index=0; index<arr.length; index++){
            root = addRecursive(root, arr[index]);
        }
        return root;
    }

    public static boolean isSames(List<TreeNode> treeNode1s, List<TreeNode> treenode2s){
        if(treeNode1s.size() != treenode2s.size()){
            return false;
        }
        for(int index=0; index<treeNode1s.size(); index++){
            if(!isSame(treeNode1s.get(index), treenode2s.get(index))){
                return false;
            }
        }
        return true;
    }

    private static boolean isSame(TreeNode treeNode1, TreeNode treeNode2){
        if((null == treeNode1) && (null == treeNode2)){
            return true;
        }
        if((null == treeNode1) || (null == treeNode2)){
            return false;
        }
        return isSame(treeNode1.getLeft(), treeNode2.getLeft()) && isSame(treeNode1.getRight(), treeNode2.getRight());
    }

    /*
        It's binary tree for leetcode version.
     */
    public static TreeNode initBinaryTreeByArray(Integer[] arr){
        if(0 == arr.length){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode head = new TreeNode(arr[0]);
        queue.add(head);

        int index = 1;
        while(index < arr.length){
            TreeNode node = queue.poll();
            if(arr[index] != null){
                node.left = new TreeNode(arr[index]);
                queue.add(node.left);
            }
            if((index + 1 < arr.length) && (arr[index + 1] != null)){
                node.right = new TreeNode(arr[index + 1]);
                queue.add(node.right);
            }
            index += 2;
        }

        return head;
    }

    private static TreeNode addRecursive(TreeNode current, Integer value){
        if(current == null){
            return new TreeNode(value);
        }

        if(value.compareTo(current.value) < 0){
            current.left = addRecursive(current.left, value);
        }else if(value.compareTo(current.value) > 0){
            current.right = addRecursive(current.right, value);
        }else{
            return current;
        }
        return current;
    }

    @Override
    public String toString() {
        return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
    }

    public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {
        if(right != null) {
            right.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
        }
        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(value).append("\n");
        if(left != null) {
            left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
        }
        return sb;
    }
}
