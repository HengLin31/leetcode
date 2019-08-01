package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

/**
 * Created by linheng on 2019/8/1.
 */
class CountCompleteTreeNodesTest extends Specification {
    def "test CountCompleteTreeNodesTest"(){
        setup: "setup CountCompleteTreeNodesTest"
        Verification verification = new CountCompleteTreeNodes()

        expect: "verify result"
        verification.verify(TreeNode.initBinaryTreeByArray(input as Integer[])) == output

        where: "input data set"
        input                           || output
        [1, 2, 3, 4, 5 , 6]   || 6
    }

}
