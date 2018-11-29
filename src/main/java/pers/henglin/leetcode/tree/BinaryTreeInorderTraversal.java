package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal implements Verification<TreeNode, List<Integer>> {
    private static final boolean PRINT = true;
    private static final boolean VISIT = false;

    private List<Integer> binaryTreeInorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<Visit> path = new Stack<>();
        path.add(new Visit(VISIT, root));
        while(!path.isEmpty()){
            Visit current = path.pop();
            if(current.getNode() == null) continue;
            if(current.isPrint){
                result.add(current.getNode().getValue());
            }else{
                path.add(new Visit(VISIT, current.getNode().getRight()));
                path.add(new Visit(PRINT, current.getNode()));
                path.add(new Visit(VISIT, current.getNode().getLeft()));
            }
        }
        return result;
    }

    @Override
    public List<Integer> verify(TreeNode... input) {
        return binaryTreeInorderTraversal(input[0]);
    }

    private class Visit{
        private boolean isPrint;
        private TreeNode node;

        public Visit(boolean isPrint, TreeNode node){
            this.isPrint = isPrint;
            this.node = node;
        }

        public boolean isPrint() {
            return isPrint;
        }

        public TreeNode getNode() {
            return node;
        }
    }
}
