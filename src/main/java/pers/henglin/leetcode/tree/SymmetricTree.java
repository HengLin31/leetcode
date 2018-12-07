package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class SymmetricTree implements Verification<TreeNode, Boolean> {
    private boolean symmetricTree(TreeNode root){
        if(null == root){
            return true;
        }
        return isMirror(root.getLeft(), root.getRight());
    }

    private boolean isMirror(TreeNode node1, TreeNode node2){
        if((null == node1) && (null == node2)){
            return true;
        }
        if((null == node1) || (null == node2)){
            return false;
        }
        if(!node1.getValue().equals(node2.getValue())){
            return false;
        }
        return (node1.getValue().equals(node2.getValue()))
                && isMirror(node1.getLeft(), node2.getRight())
                && isMirror(node1.getRight(), node2.getLeft());
    }

    @Override
    public Boolean verify(TreeNode... input) {
        return symmetricTree(input[0]);
    }
}
