package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification
import spock.lang.Specification

/**
 * Created by linheng on 2018/6/2.
 */
class PalindromeNumberTest extends Specification{
    def "test PalindromeNumber"(){
        setup: "setup PalindromeNumber"
        Verification verification = new PalindromeNumber()

        expect: "verify result"
        verification.verify(input as Integer) == output

        where: "input data set"
        input   || output
        121     || true
        -121    || false
        10      || false
    }
}
