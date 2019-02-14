package pers.henglin.leetcode.design

import spock.lang.Specification

class LRUCacheTest extends Specification {
    def "test LRUCache"(){
        given: "create a new LRUCache"
        def cache = new LRUCache(2)

        when: "put and get"
        cache.put(1, 1)
        cache.put(2, 2)
        cache.get(1)
        cache.put(3, 3)
        cache.get(2)
        cache.put(4, 4)
        cache.get(1)
        cache.get(3)
        cache.get(4)

        then: "check log"
        cache.getOperationLog() == [null, null, 1, null, -1, null, -1, 3, 4]
    }
}
