package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class SymmetricTreeTest extends Specification {
    def "test SymmetricTree"(){
        setup: "setup SymmetricTree"
        Verification verification = new SymmetricTree()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                       || output
        [1, 2, 2, 3, 4, 4, 3]       || true
        [1, 2, 2, null, 3, null, 3] || false
    }
}
