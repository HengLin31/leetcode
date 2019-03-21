package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class BinaryTreeRightSideViewTest extends Specification {
    def "test BinaryTreeRightSideView"(){
        setup: "setup BinaryTreeRightSideView"
        Verification verification = new BinaryTreeRightSideView()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                           || output
        [1, 2, 3, null, 5, null, 4]     || [1, 3, 4]
    }
}
