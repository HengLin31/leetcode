package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeLinkNode
import spock.lang.Specification

class PopulatingNextRightPointersInEachNodeTest extends Specification {
    def "test PopulatingNextRightPointersInEachNode"(){
        setup: "setup PopulatingNextRightPointersInEachNode"
        Verification verification = new PopulatingNextRightPointersInEachNode()

        expect: "verify result"
        TreeLinkNode.buildTreeNextList(verification.verify(TreeLinkNode.initBinaryTreeByArray(input as Integer[]))) == output

        where: "input data set"
        input                       || output
        [0, 1, 2, 3, 4, 5, 6]       || [0, null, 1, 2, null, 3, 4, 5, 6, null]
    }
}
