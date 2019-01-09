package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class BestTimeToBuyAndSellStockIITest extends Specification {
    def "test BestTimeToBuyAndSellStockII"(){
        setup: "setup BestTimeToBuyAndSellStockII"
        Verification verification = new BestTimeToBuyAndSellStockII()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                       || output
        [7, 1, 5, 3, 6, 4]          || 7
    }
}
