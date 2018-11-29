package pers.henglin.leetcode.tree

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.TreeNode
import spock.lang.Specification

class UniqueBinarySearchTreesIITest extends Specification {
    def "test UniqueBinarySearchTreesII"(){
        setup: "setup UniqueBinarySearchTreesII"
        Verification verification = new UniqueBinarySearchTreesII()


        expect: "verify result"
        def datas = []
        output.each { ele ->
            datas.add(TreeNode.initBinaryTreeByArray(ele as Integer[]))
        }
        TreeNode.isSames(verification.verify(input), datas)

        where: "input data set"
        input || output
        3     || [[1, null, 2, null, 3], [1, null, 3, 2], [2, 1, 3], [3, 1, null, null, 2], [3, 2, null, 1]]
    }
}
