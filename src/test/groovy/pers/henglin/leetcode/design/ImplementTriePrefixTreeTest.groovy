package pers.henglin.leetcode.design

import spock.lang.Specification

class ImplementTriePrefixTreeTest extends Specification {
    def "test ImplementTrie (Prefix Tree)"(){
        given: "create a new ImplementTrie"
        def trie = new ImplementTriePrefixTree()

        when: "insert and search and startsWith"
        trie.insert("apple")
        trie.searchLog("apple")
        trie.searchLog("app")
        trie.startsWithLog("app")
        trie.insert("app")
        trie.searchLog("app")

        then: "check log"
        trie.getOperationLog() == [null, null, true, false, true, null, true]
    }
}
