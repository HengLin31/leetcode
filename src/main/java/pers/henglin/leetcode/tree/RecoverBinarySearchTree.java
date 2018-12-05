package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class RecoverBinarySearchTree implements Verification<TreeNode, TreeNode> {
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = null;

    private void recoverBinarySearchTree(TreeNode root){
        inorder(root);
        swap();
    }

    private void swap(){
        int temp = first.getValue();
        first.setValue(second.getValue());
        second.setValue(temp);
    }

    private void inorder(TreeNode node) {
        if(node == null){
            return;
        }
        inorder(node.getLeft());
        if(null != prev && null == first && prev.getValue() > node.getValue()){
            first = prev;//find first
        }
        if(null != first && prev.getValue() > node.getValue()){
            second = node;//find last
        }
        prev = node;//next
        inorder(node.getRight());
    }

    @Override
    public TreeNode verify(TreeNode... input) {
        TreeNode root = input[0];
        recoverBinarySearchTree(root);
        return root;
    }
}
