package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class BinaryTreeMaximumPathSum implements Verification<TreeNode, Integer> {
    private int binaryTreeMaximumPathSum(TreeNode root){
        if(null == root){
            return 0;
        }
        int[] max = new int[]{Integer.MIN_VALUE};
        dfs(root, max);
        return max[0];
    }

    private int dfs(TreeNode root, int[] max) {
        if(null == root){
            return 0;
        }
        int leftMax = dfs(root.getLeft(), max);
        int rightMax = dfs(root.getRight(), max);
        int currentPath = Math.max(0, leftMax) + Math.max(0, rightMax) + root.getValue();
        max[0] = Math.max(currentPath, max[0]);

        return Math.max(0, Math.max(leftMax, rightMax)) + root.getValue();
    }

    @Override
    public Integer verify(TreeNode... input) {
        return binaryTreeMaximumPathSum(input[0]);
    }
}
