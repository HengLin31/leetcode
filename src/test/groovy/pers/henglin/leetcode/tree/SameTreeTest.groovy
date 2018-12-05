package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class SameTreeTest extends Specification {
    def "test SameTree"(){
        setup: "setup SameTree"
        Verification verification = new SameTree()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input1 as Integer[]), TreeNode.initBinaryTreeByArray(input2 as Integer[])) == output

        where: "input data set"
        input1      | input2       || output
        [1, 2, 3]   | [1, 2, 3]    || true
        [1, 2]      | [1, null, 2] || false
        [1, 2, 1]   | [1, 1, 2]    || false
    }
}
