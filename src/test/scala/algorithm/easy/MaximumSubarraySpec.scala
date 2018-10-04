package com.leetcode.algorithm.easy.MaximumSubarray

import com.leetcode.algorithm.easy.MaximumSubarray.Solution._
import org.scalatest._

class MaximumSubarraySpec extends FlatSpec with Matchers {
  "[-2, 1, -3, 4, -1, 2, 1, -5, 4]" should "return 6" in {
    maxSubArray(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) shouldEqual 6
  }

  "[1]" should "return 1" in {
    maxSubArray(Array(1)) shouldEqual 1
  }

  "[-2, -1]" should "return -1" in {
    maxSubArray(Array(-2, -1)) shouldEqual -1
  }
}