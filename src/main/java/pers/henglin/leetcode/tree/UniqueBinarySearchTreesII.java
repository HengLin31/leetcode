package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII implements Verification<Integer, List<TreeNode>> {
    private List<TreeNode> uniqueBinarySearchTreesII(int n){
        if(n <= 0){
            return new ArrayList<>();
        }
        return generate(1, n);
    }

    private List<TreeNode> generate(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if(start > end){
            result.add(null);
            return result;
        }
        if(start == end){
            result.add(new TreeNode(start));
            return result;
        }

        for(int index=start; index<=end; index++){
            List<TreeNode> leftNodes = generate(start, index - 1);
            List<TreeNode> rightNodes = generate(index + 1, end);
            for(TreeNode leftNode:leftNodes){
                for(TreeNode rightNode:rightNodes) {
                    TreeNode tempNode = new TreeNode(index);
                    tempNode.setLeft(leftNode);
                    tempNode.setRight(rightNode);
                    result.add(tempNode);
                }
            }
        }
        return result;
    }

    @Override
    public List<TreeNode> verify(Integer... input) {
        return uniqueBinarySearchTreesII(input[0]);
    }
}
