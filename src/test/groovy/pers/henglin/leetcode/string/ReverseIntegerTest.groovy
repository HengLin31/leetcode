package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/24.
 */
class ReverseIntegerTest extends Specification {
    def "test ReverseInteger"() {
        setup: "setup ReverseInteger"
        Verification submissionDetail = new ReverseInteger()

        expect: "verify result"
        submissionDetail.verify(input) == output

        where: "input data set"
        input  || output
        123    || 321
        -123   || -321
        120    || 21
    }
}