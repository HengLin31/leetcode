package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII implements Verification<TreeNode, List<List<Integer>>> {
    private List<List<Integer>> binaryTreeLevelOrderTraversalII(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(null == root){
            return result;
        }
        bfs(root, result, 0);
        return result;
    }

    private void bfs(TreeNode head, List<List<Integer>> result, int level){
        if(null == head){
            return;
        }
        if(level >= result.size()){
            result.add(0, new ArrayList<>());
        }
        bfs(head.getLeft(), result, level + 1);
        bfs(head.getRight(), result, level + 1);
        result.get(result.size() - level - 1).add(head.getValue());
    }

    @Override
    public List<List<Integer>> verify(TreeNode... input) {
        return binaryTreeLevelOrderTraversalII(input[0]);
    }
}
