package pers.henglin.leetcode.graph

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.UndirectedGraphNode
import spock.lang.Specification

class CloneGraphTest extends Specification{
    def "test CloneGraph"(){
        given: "CloneGraph AddTwoNumbers"
        Verification verification = new CloneGraph()

        expect: "verify result"
        UndirectedGraphNode.isSame(UndirectedGraphNode.init(input), verification.verify(UndirectedGraphNode.init(input))) == output

        where: "input data set"
        input                                          || output
        [0, 1, 2, null, 1, 2, null, 2, 2] as Integer[] || true
    }
}
