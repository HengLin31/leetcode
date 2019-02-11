package pers.henglin.leetcode.linkedlist

import pers.henglin.leetcode.Verification
import pers.henglin.leetcode.bean.RandomListNode
import spock.lang.Specification

class CopyListWithRandomPointerTest extends Specification{
    def "test CopyListWithRandomPointer"() {
        given: "given CopyListWithRandomPointer"
        Verification verification = new CopyListWithRandomPointer()

        expect: "verify result"
        RandomListNode node = RandomListNode.init(input as int[])
        RandomListNode.isSame(node, verification.verify(node))

        where: "input data set"
        input           || output
        [1, 2, 3, 4, 5] || true
    }
}
