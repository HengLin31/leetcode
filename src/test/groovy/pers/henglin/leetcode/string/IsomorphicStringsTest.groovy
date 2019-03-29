package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class IsomorphicStringsTest extends Specification {
    def "test IsomorphicStrings"(){
        setup: "setup IsomorphicStrings"
        Verification verification = new IsomorphicStrings()

        expect: "verify result"
        verification.verify(s, t) == output

        where: "input data set"
        s       | t         || output
        "egg"   | "add"     || true
        "foo"   | "bar"     || false
        "paper" | "title"   || true
    }
}
