package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal implements Verification<TreeNode, List<List<Integer>>> {
    private List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, result, 0);
        return result;
    }

    private void levelOrder(TreeNode root, List<List<Integer>> result, int level){
        if(null == root){
            return;
        }
        List<Integer> subs;
        if(level >= result.size()){
            subs = new ArrayList<>();
            result.add(subs);
        }else{
            subs = result.get(level);
        }
        subs.add(root.getValue());
        levelOrder(root.getLeft(), result, level + 1);
        levelOrder(root.getRight(), result, level + 1);
    }

    @Override
    public List<List<Integer>> verify(TreeNode... input) {
        return binaryTreeLevelOrderTraversal(input[0]);
    }
}
