package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class SimplifyPathTest extends Specification {
    def "test SimplifyPath"() {
        setup: "setup SimplifyPath"
        Verification verification = new SimplifyPath()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                   || output
        "/home/"                || "/home"
        "/a/./b/../../c/"       || "/c"
        "/a/../../b/../c//.//"  || "/c"
        "/a//b////c/d//././/.." || "/a/b/c"
    }
}
