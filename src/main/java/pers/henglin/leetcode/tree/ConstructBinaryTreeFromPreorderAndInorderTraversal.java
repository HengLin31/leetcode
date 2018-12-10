package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal implements Verification<int[], TreeNode> {
    private int preorderIndex = 0;
    private int inorderIndex = 0;

    private TreeNode constructBinaryTreeFromPreorderAndInorderTraversal(int[] preorder, int[] inorder){
        return dfs(preorder, inorder, null);
    }

    private TreeNode dfs(int[] preorder, int[] inorder, TreeNode end){
        if((inorderIndex > inorder.length - 1) || ((null != end) && end.getValue().equals(inorder[inorderIndex]))){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorderIndex++]);
        root.setLeft(dfs(preorder, inorder, root));
        inorderIndex++;
        root.setRight(dfs(preorder, inorder, end));

        return root;
    }

    @Override
    public TreeNode verify(int[]... input) {
        return constructBinaryTreeFromPreorderAndInorderTraversal(input[0], input[1]);
    }
}
