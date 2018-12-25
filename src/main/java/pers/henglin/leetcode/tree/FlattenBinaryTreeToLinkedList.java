package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class FlattenBinaryTreeToLinkedList implements Verification<TreeNode, TreeNode> {
    private void flattenBinaryTreeToLinkedList(TreeNode root){
        while(null != root){
            TreeNode point = root.getLeft();
            if(null != point){
                while(null != point.getRight()) {
                    point = point.getRight();
                }
                point.setRight(root.getRight());
                root.setRight(root.getLeft());
                root.setLeft(null);
            }
            root = root.getRight();
        }
    }

    @Override
    public TreeNode verify(TreeNode... input) {
        TreeNode root = input[0];
        flattenBinaryTreeToLinkedList(root);
        return root;
    }
}
