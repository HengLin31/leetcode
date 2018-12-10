package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal implements Verification<int[], TreeNode> {
    private TreeNode constructBinaryTreeFromInorderAndPostorderTraversal(int[] inorder, int[] postorder){
        int inorderIndex = inorder.length;
        int postorderIndex = postorder.length;

        return dfs(inorder, 0, inorderIndex - 1, postorder, 0 , postorderIndex - 1);
    }

    private TreeNode dfs(int[] inorder, int inorderIndexStart, int inorderIndexEnd, int[] postorder, int postorderIndexStart, int postorderIndexEnd) {
        if(postorderIndexStart > postorderIndexEnd){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorderIndexEnd]);
        //find the root in the inorder sequence
        for(int index=inorderIndexEnd; index>=inorderIndexStart; index--) {
            if(inorder[index] == postorder[postorderIndexEnd]){
                int lenght = inorderIndexEnd - index;
                root.setLeft(dfs(inorder, inorderIndexStart, index - 1, postorder, postorderIndexStart, postorderIndexEnd - lenght - 1));
                root.setRight(dfs(inorder, index + 1, inorderIndexEnd, postorder, postorderIndexEnd - lenght, postorderIndexEnd - 1));
                break;//already found
            }
        }
        return root;
    }

    @Override
    public TreeNode verify(int[]... input) {
        return constructBinaryTreeFromInorderAndPostorderTraversal(input[0], input[1]);
    }
}
