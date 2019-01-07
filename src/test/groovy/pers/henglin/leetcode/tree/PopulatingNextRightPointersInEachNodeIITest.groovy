package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeLinkNode
import spock.lang.Specification

class PopulatingNextRightPointersInEachNodeIITest extends Specification {
    def "test PopulatingNextRightPointersInEachNodeII"(){
        setup: "setup PopulatingNextRightPointersInEachNodeII"
        Verification verification = new PopulatingNextRightPointersInEachNodeII()

        expect: "verify result"
        TreeLinkNode.buildTreeNextList(verification.verify(TreeLinkNode.initBinaryTreeByArray(input as Integer[]))) == output

        where: "input data set"
        input                           || output
        [3, 9, 20, null, null, 15, 7]   || [3, null, 9, 20, null, 15, 7, null]
    }
}
