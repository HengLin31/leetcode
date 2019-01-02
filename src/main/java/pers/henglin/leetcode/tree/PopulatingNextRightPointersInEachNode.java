package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeLinkNode;

public class PopulatingNextRightPointersInEachNode implements Verification<TreeLinkNode, TreeLinkNode> {
    private void populatingNextRightPointersInEachNode(TreeLinkNode root){
        if(null == root){
            return;
        }
        if(null != root.getRight()){
            root.getLeft().setNext(root.getRight());
            if(null != root.getNext()){
                root.getRight().setNext(root.getNext().getLeft());
            }
        }
        populatingNextRightPointersInEachNode(root.getLeft());
        populatingNextRightPointersInEachNode(root.getRight());
    }

    @Override
    public TreeLinkNode verify(TreeLinkNode... input) {
        TreeLinkNode root = input[0];
        populatingNextRightPointersInEachNode(root);
        return root;
    }
}
