package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class SumRootToLeafNumbers implements Verification<TreeNode, Integer> {
    private static final int SHIFT = 10;

    private int sumRootToLeafNumbers(TreeNode root){
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int sum) {
        if(null == root){
            return 0;
        }
        sum = (sum * SHIFT) + root.getValue();
        if((null == root.getLeft()) && (null == root.getRight())){
            return sum;
        }else{
            return dfs(root.getLeft(), sum) + dfs(root.getRight(), sum);
        }
    }

    @Override
    public Integer verify(TreeNode... input) {
        return sumRootToLeafNumbers(input[0]);
    }
}
