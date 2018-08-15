package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class GroupAnagramsTest extends Specification {
    def "test GroupAnagrams"(){
        setup: "setup GroupAnagrams"
        Verification verification = new GroupAnagrams()

        expect: "verify result"
        verification.verify(input as String[]) == output

        where: "input data set"
        input                                       || output
        ["eat", "tea", "tan", "ate", "nat", "bat"]  || [["eat", "tea", "ate"], ["bat"], ["tan", "nat"]]
    }
}
