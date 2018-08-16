package pers.henglin.leetcode.math

import pers.henglin.leetcode.Verification

import spock.lang.Specification

class PowXNTest  extends Specification {
    def "test PowXN"(){
        setup: "setup PowXN"
        Verification verification = new PowXN()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                 || output
        [x: 2.00000 as double , n: 10]  || 1024.00000
        [x: 2.10000 as double , n: 3]   || 9.261000000000001 //9.26100
        [x: 2.00000 as double , n: -2]  || 0.25000
    }
}
