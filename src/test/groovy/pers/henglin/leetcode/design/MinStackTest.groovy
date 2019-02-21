package pers.henglin.leetcode.design

import spock.lang.Specification

class MinStackTest extends Specification {
    def "test MinStack"(){
        given: "create a new MinStack"
        def minStack = new MinStack()

        when: "push, pop, top and getMin"
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        minStack.getMin()
        minStack.pop()
        minStack.top()
        minStack.getMin()

        then: "check log"
        minStack.getOperationLog() == [null, null, null, -3, null, 0, -2]
    }
}
