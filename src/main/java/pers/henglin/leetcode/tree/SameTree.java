package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class SameTree implements Verification<TreeNode, Boolean> {
    private boolean sameTree(TreeNode p, TreeNode q){
        if((null == p) && (null == q)){
            return true;
        }
        if((null == p) || (null == q)){
            return false;
        }
        if(!p.getValue().equals(q.getValue())){
            return false;
        }
        return sameTree(p.getLeft(), q.getLeft()) && sameTree(p.getRight(), q.getRight());
    }

    @Override
    public Boolean verify(TreeNode... input) {
        return sameTree(input[0], input[1]);
    }
}
