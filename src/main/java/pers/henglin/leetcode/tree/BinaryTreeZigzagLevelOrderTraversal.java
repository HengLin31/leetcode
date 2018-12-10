package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal implements Verification<TreeNode, List<List<Integer>>> {
    private List<List<Integer>> binaryTreeZigzagLevelOrderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(null == root){
            return result;
        }
        dfs(result, root, 0, true);
        return result;
    }

    private void dfs(List<List<Integer>> result, TreeNode root, int level, boolean fromLeftToRight) {
        if(null == root){
            return;
        }
        if(result.size() <= level){
            result.add(new ArrayList<>());
        }
        if(fromLeftToRight){
            result.get(level).add(root.getValue());
        }else{
            result.get(level).add(0, root.getValue());
        }
        dfs(result, root.getLeft(), level + 1, !fromLeftToRight);
        dfs(result, root.getRight(), level + 1, !fromLeftToRight);
    }

    @Override
    public List<List<Integer>> verify(TreeNode... input) {
        return binaryTreeZigzagLevelOrderTraversal(input[0]);
    }
}
