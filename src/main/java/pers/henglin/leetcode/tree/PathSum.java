package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.Map;

public class PathSum implements Verification<Map, Boolean> {
    private boolean pathSum(TreeNode root, int sum){
        if(null == root){
            return false;
        }
        if((null == root.getLeft()) && (null == root.getRight())){
            if(sum == root.getValue()){
                return true;
            }
        }
        return pathSum(root.getLeft(), sum - root.getValue()) ||
                pathSum(root.getRight(), sum - root.getValue());
    }

    @Override
    public Boolean verify(Map... input) {
        TreeNode root = TreeNode.initBinaryTreeByArray((Integer[]) input[0].get("root"));
        int sum = (int) input[0].get("sum");
        return pathSum(root, sum);
    }
}
