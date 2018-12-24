package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class BalancedBinaryTree implements Verification<TreeNode, Boolean> {
    private boolean balancedBinaryTree(TreeNode root){
        return height(root) != -1;
    }

    public int height(TreeNode root) {
        if(null == root){
            return 0;
        }
        int left = height(root.getLeft());
        if(-1 == left){
            return -1;
        }
        int right = height(root.getRight());
        if(-1 == right){
            return -1;
        }
        if(Math.abs(left - right) > 1){
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    @Override
    public Boolean verify(TreeNode... input) {
        return balancedBinaryTree(input[0]);
    }
}
