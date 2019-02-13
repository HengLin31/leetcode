package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal implements Verification<TreeNode, List<Integer>> {
    private List<Integer> binaryTreePostorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result;
    }

    private void visit(TreeNode root, List<Integer> result) {
        if(null == root){
            return;
        }
        visit(root.getLeft(), result);
        visit(root.getRight(), result);
        result.add(root.getValue());
    }

    @Override
    public List<Integer> verify(TreeNode... input) {
        return binaryTreePostorderTraversal(input[0]);
    }
}
