package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class MinimumDepthOfBinaryTree implements Verification<TreeNode, Integer> {
    private int minimumDepthOfBinaryTree(TreeNode root){
        if(null == root){
            return 0;
        }

        if((null != root.getLeft()) && (null != root.getRight())){
            return Math.min(minimumDepthOfBinaryTree(root.getLeft()),
                    minimumDepthOfBinaryTree(root.getRight())) + 1;
        }else{
            return Math.max(minimumDepthOfBinaryTree(root.getLeft()),
                    minimumDepthOfBinaryTree(root.getRight())) + 1;
        }
    }

    @Override
    public Integer verify(TreeNode... input) {
        return minimumDepthOfBinaryTree(input[0]);
    }
}
