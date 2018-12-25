package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PathSumII implements Verification<Map, List<List<Integer>>> {
    private List<List<Integer>> pathSumII(TreeNode root, int sum){
        List<List<Integer>> result = new ArrayList<>();
        if(null == root){
            return result;
        }
        addPath(root, sum, new ArrayList<>(), result);
        return result;
    }

    private void addPath(TreeNode root,int sum,List<Integer> temp, List<List<Integer>> result){
        if(null == root){
            return;
        }
        temp.add(root.getValue());
        if(root.getValue().equals(sum) && (null == root.getLeft()) && (null == root.getRight())){
            result.add(new ArrayList<>(temp));
        }else{
            addPath(root.getLeft(),sum - root.getValue(), temp, result);
            addPath(root.getRight(),sum - root.getValue(), temp, result);
        }
        temp.remove(temp.size() - 1);
    }

    @Override
    public List<List<Integer>> verify(Map... input) {
        TreeNode root = TreeNode.initBinaryTreeByArray((Integer[]) input[0].get("root"));
        int sum = (int) input[0].get("sum");
        return pathSumII(root, sum);
    }
}
