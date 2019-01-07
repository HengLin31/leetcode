package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeLinkNode;

public class PopulatingNextRightPointersInEachNodeII implements Verification<TreeLinkNode, TreeLinkNode> {
    private void populatingNextRightPointersInEachNodeII(TreeLinkNode root){
        while(null != root){
            TreeLinkNode temp = new TreeLinkNode(0);
            TreeLinkNode current = temp;
            while(null != root){
                if(null != root.getLeft()){
                    current.setNext(root.getLeft());
                    current = current.getNext();
                }
                if(null != root.getRight()){
                    current.setNext(root.getRight());
                    current = current.getNext();
                }
                root = root.getNext();
            }
            root = temp.getNext();
        }
    }

    @Override
    public TreeLinkNode verify(TreeLinkNode... input) {
        TreeLinkNode root = input[0];
        populatingNextRightPointersInEachNodeII(root);
        return root;
    }
}
