package com.leetcode.algorithm.hard.TrappingRainWater

import org.scalatest._

class TrappingRainWaterSpec extends FlatSpec with Matchers {
  "Case 1" should "return 6" in {
    Solution.trap(Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)) shouldEqual 6
  }

}
