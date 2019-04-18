package pers.henglin.leetcode.design

import spock.lang.Specification

class AddAndSearchWordDataStructureTest extends Specification {
    def "test AddAndSearchWord (Data Structure)"(){
        given: "create a new AddAndSearchWord"
        def wordDictionary = new AddAndSearchWordDataStructure()

        when: "add and search"
        wordDictionary.addWord("bad")
        wordDictionary.addWord("dad")
        wordDictionary.addWord("mad")
        wordDictionary.search("pad")
        wordDictionary.search("bad")
        wordDictionary.search(".ad")
        wordDictionary.search("b..")

        then: "check log"
        wordDictionary.getOperationLog() == [null, null, null, null, false, true, true, true]
    }
}
