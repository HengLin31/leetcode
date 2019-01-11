package pers.henglin.leetcode.array

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class BestTimeToBuyAndSellStockIIITest extends Specification {
    def "test BestTimeToBuyAndSellStockIII"(){
        setup: "setup BestTimeToBuyAndSellStockIII"
        Verification verification = new BestTimeToBuyAndSellStockIII()

        expect: "verify result"
        verification.verify(input as Integer[]) == output

        where: "input data set"
        input                       || output
        [3, 3, 5, 0, 0, 3, 1, 4]    || 6
    }
}
