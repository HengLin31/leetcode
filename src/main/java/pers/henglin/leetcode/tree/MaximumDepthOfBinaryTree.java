package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class MaximumDepthOfBinaryTree implements Verification<TreeNode, Integer> {
    private int maximumDepthOfBinaryTree(TreeNode root){
        if(null == root){
            return 0;
        }
        return 1 + Math.max(maximumDepthOfBinaryTree(root.getLeft()),
                maximumDepthOfBinaryTree(root.getRight()));
    }

    @Override
    public Integer verify(TreeNode... input) {
        return maximumDepthOfBinaryTree(input[0]);
    }
}
