package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

/**
 * Created by linheng on 2019/8/1.
 */
public class CountCompleteTreeNodes implements Verification<TreeNode, Integer> {
    private static final int INIT_COUNT = -1;

    private int countCompleteTreeNodes(TreeNode root){
        return countNode(root, INIT_COUNT, INIT_COUNT);
    }

    private int countNode(TreeNode node, int leftLevel, int rightLevel) {
        if(INIT_COUNT == leftLevel){
            TreeNode root = node;
            leftLevel = 0;
            while(null != root){
                leftLevel += 1;
                root = root.getLeft();
            }
        }
        if(INIT_COUNT == rightLevel){
            TreeNode root = node;
            rightLevel = 0;
            while(null != root){
                rightLevel += 1;
                root = root.getRight();
            }
        }
        if(leftLevel == rightLevel){
            return (1 << leftLevel) - 1;
        }
        return 1 + countNode(node.getLeft(), leftLevel - 1, INIT_COUNT) + countNode(node.getRight(), INIT_COUNT, rightLevel - 1);
    }


    @Override
    public Integer verify(TreeNode... input) {
        return countCompleteTreeNodes(input[0]);
    }
}
