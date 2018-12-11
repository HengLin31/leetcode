package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.TreeNode;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree implements Verification<Integer, TreeNode> {
    private TreeNode convertSortedArrayToBinarySearchTree(int[] nums){
        if(( null == nums) || (0 == nums.length)){
            return null;
        }
        return buildTree(0, nums.length - 1, nums);
    }

    private TreeNode buildTree(int left, int right, int[] nums) {
        if(left > right){
            return null;
        }
        int middle = (left + right) / 2;
        TreeNode head = new TreeNode(nums[middle]);
        head.setLeft(buildTree(left, middle - 1, nums));
        head.setRight(buildTree(middle + 1, right, nums));
        return head;
    }

    @Override
    public TreeNode verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return convertSortedArrayToBinarySearchTree(nums);
    }
}
