package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class ValidateBinarySearchTree implements Verification<TreeNode, Boolean> {
    private boolean validateBinarySearchTree(TreeNode root){
        if(null == root){
            return true;
        }
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validate(TreeNode root, double min, double max){
        if(null == root){
            return true;
        }

        if((min >= root.getValue()) || root.getValue() >= max){
            return false;
        }
        return validate(root.getLeft(), min, root.getValue()) &&
                validate(root.getRight(), root.getValue(), max);
    }

    @Override
    public Boolean verify(TreeNode... input) {
        return validateBinarySearchTree(input[0]);
    }
}
