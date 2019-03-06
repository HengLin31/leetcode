package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.bean.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTreeIterator{
    private static final int NONE = -1;
    private Deque<Integer> deque;

    private List<String> operationLog = new LinkedList<>();

    public BinarySearchTreeIterator(TreeNode root) {
        this.deque = new ArrayDeque<>();
        if(null == root){
            return;
        }
        init(root);
    }

    /** @return the next smallest number */
    public int next() {
        if(hasNext()){
            Integer next = this.deque.pollFirst();
            return (null == next) ? NONE : next;
        }
        return NONE;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !deque.isEmpty();
    }

    public int logNext(){
        int next = next();
        this.operationLog.add(String.valueOf(next));
        return next;
    }

    public boolean logHasNext(){
        boolean hasNext = hasNext();
        this.operationLog.add(String.valueOf(hasNext));
        return hasNext;
    }

    public List<String> getOperationLog(){
        return this.operationLog;
    }

    private void init(TreeNode treeNode) {
        if(null == treeNode) {
            return;
        }
        init(treeNode.getLeft());
        deque.offerLast(treeNode.getValue());
        init(treeNode.getRight());
    }
}
