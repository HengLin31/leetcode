package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class BestTimeToBuyAndSellStockTest extends Specification {
    def "test BestTimeToBuyAndSellStock"(){
        setup: "setup BestTimeToBuyAndSellStock"
        Verification verification = new BestTimeToBuyAndSellStock()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                       || output
        [7, 1, 5, 3, 6, 4]          || 5
    }
}
