package com.leetcode.algorithm.easy.TwoSum

import com.leetcode.algorithm.easy.TwoSum.Solution._
import org.scalatest._


class TwoSumSpec extends FlatSpec with Matchers {
  "Two Sum" should "return 2 numbers" in {
    twoSum(Array(2, 7, 11, 15), 9) shouldEqual Array(0, 1)
  }

  "Two Sum" should "return empty array when nums is an empty array" in {
    twoSum(Array(), 9) shouldEqual Array()
  }

  "Two Sum" should "return empty array when result could not be found" in {
    twoSum(Array(2, 11, 15), 9) shouldEqual Array()
  }
}
