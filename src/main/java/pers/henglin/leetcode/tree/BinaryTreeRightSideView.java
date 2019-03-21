package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView implements Verification<TreeNode, List<Integer>> {
    private List<Integer> binaryTreeRightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    private void dfs(TreeNode root, int level, List<Integer> result) {
        if(null == root){
            return;
        }
        if(level == result.size()){
            result.add(root.getValue());
        }
        dfs(root.getRight(), level + 1, result);
        dfs(root.getLeft(), level + 1, result);
    }

    @Override
    public List<Integer> verify(TreeNode... input) {
        return binaryTreeRightSideView(input[0]);
    }
}
