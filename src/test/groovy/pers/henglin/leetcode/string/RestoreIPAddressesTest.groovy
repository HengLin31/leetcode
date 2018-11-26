package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class RestoreIPAddressesTest extends Specification {
    def "test RestoreIPAddresses"() {
        setup: "setup RestoreIPAddresses"
        Verification verification = new RestoreIPAddresses()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input         || output
        "25525511135" || ["255.255.11.135", "255.255.111.35"]
    }
}
