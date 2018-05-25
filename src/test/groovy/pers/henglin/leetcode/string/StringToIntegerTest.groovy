package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/25.
 */
class StringToIntegerTest extends Specification {
    def "test StringToInteger"() {
        setup: "setup StringToInteger"
        Verification stringToInteger = new StringToInteger()

        expect: "verify result"
        stringToInteger.verify(input) == output

        where: "input data set"
        input               || output
        "42"                || 42
        "   -42"            || -42
        "4193 with words"   || 4193
        "words and 987"     || 0
        "-91283472332"      || -2147483648
    }
}
