package pers.henglin.leetcode.dp

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class BestTimeToBuyAndSellStockIVTest extends Specification {
    def "test BestTimeToBuyAndSellStockIV"(){
        setup: "setup BestTimeToBuyAndSellStockIV"
        Verification verification = new BestTimeToBuyAndSellStockIV()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                        || output
        [prices:[2, 4, 1] as int[],          k: 2]   || 2
        [prices:[3, 2, 6, 5, 0, 3] as int[], k: 2]   || 7
    }
}
