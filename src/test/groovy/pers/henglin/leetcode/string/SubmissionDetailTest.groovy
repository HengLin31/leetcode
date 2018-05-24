package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/5/24.
 */
class SubmissionDetailTest extends Specification {
    def "test SubmissionDetail"() {
        setup: "setup SubmissionDetail"
        Verification submissionDetail = new SubmissionDetail()

        expect: "verify result"
        submissionDetail.verify(input) == output

        where: "input data set"
        input  || output
        123    || 321
        -123   || -321
        120    || 21
    }
}