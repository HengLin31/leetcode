package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CompareVersionNumbersTest extends Specification {
    def "test CompareVersionNumbers"(){
        setup: "setup CompareVersionNumbers"
        Verification verification = new CompareVersionNumbers()

        expect: "verify result"
        verification.verify(version1, version2) == output

        where: "input data set"
        version1  | version2   || output
        "0.1"     | "1.1"      || -1
        "1.0.1"   | "1"        || 1
        "7.5.2.4" | "7.5.3"    || -1
        "1.01"    | "1.001"    || 0
        "1.0"     | "1.0.0"    || 0


    }
}
