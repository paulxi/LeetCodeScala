package com.leetcode.algorithm.easy.BestTimeToBuyAndSellStock

import com.leetcode.algorithm.easy.BestTimeToBuyAndSellStock.Solution._
import org.scalatest._

class BestTimeToBuyAndSellStockSpec extends FlatSpec with Matchers {
  "[7,1,5,3,6,4]" should "return 5" in {
    maxProfit(Array(7,1,5,3,6,4)) shouldEqual 5
  }

  "[7,6,4,3,1]" should "return 0" in {
    maxProfit(Array(7,6,4,3,1)) shouldEqual 0
  }

}
