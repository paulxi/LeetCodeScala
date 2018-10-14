package com.leetcode.algorithm.medium.NextPermutation

import com.leetcode.algorithm.medium.NextPermutation.Solution._
import org.scalatest._

class NextPermutationSpec extends FlatSpec with Matchers {
  "[1,2,3]" should "return [1,3,2]" in {
    val nums = Array(1, 2, 3)
    nextPermutation(nums)
    nums shouldEqual Array(1, 3, 2)
  }

  "[3,2,1]" should "return [1,2,3]" in {
    val nums = Array(3, 2, 1)
    nextPermutation(nums)
    nums shouldEqual Array(1, 2, 3)
  }

  "[1,1,5]" should "return [1,5,1]" in {
    val nums = Array(1, 1, 5)
    nextPermutation(nums)
    nums shouldEqual Array(1, 5, 1)
  }

}
