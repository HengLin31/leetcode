package pers.henglin.leetcode.design;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    private static final Integer NULL = null;

    private int min;
    private Stack<Integer> stack;

    private List<Integer> operationLog = new LinkedList<>();// log operation process

    public MinStack() {
        this.min = Integer.MAX_VALUE;
        this.stack = new Stack<>();
    }

    public void push(int x) {
        this.operationLog.add(NULL);
        if(x <= this.min){
            this.stack.push(this.min);
            this.min = x;
        }
        this.stack.push(x);
    }

    public void pop() {
        this.operationLog.add(NULL);
        if(this.stack.isEmpty()){
            return;
        }
        int popValue = this.stack.pop();
        if(popValue == this.min){
            this.min = this.stack.pop();
        }
    }

    public int top() {
        int top = this.stack.peek();
        this.operationLog.add(top);
        return top;
    }

    public int getMin() {
        this.operationLog.add(this.min);
        return this.min;
    }

    public List<Integer> getOperationLog(){
        return operationLog;
    }
}
