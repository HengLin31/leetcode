package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class WildcardMatchingTest extends Specification {
    def "test WildcardMatching"() {
        setup: "setup WildcardMatching"
        Verification verification = new WildcardMatching()

        expect: "verify result"
        verification.verify(input1, input2) == output

        where: "input data set"
        input1    | input2           || output
        "aa"      | "a"              || false
        "aa"      | "*"              || true
        "cb"      | "?a"             || false
        "adceb"   | "*a*b"           || true
        "acdcb"   | "a*c?b"          || false
    }
}
