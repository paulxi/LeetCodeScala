package com.leetcode.algorithm.easy.TwoSum

import Solution._
import org.scalatest._


class TwoSumSpec extends FlatSpec with Matchers {
  "Two Sum" should "return 2 numbers" in {
    twoSum(Array(0, 1), 1) shouldEqual Array(0, 1)
  }
}
