package com.leetcode.algorithm.medium.ProductOfArrayExceptSelf

object Solution {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val result = new Array[Int](nums.length)
    result(0) = 1

    for (i <- 1 until nums.length) {
      result(i) = result(i - 1) * nums(i - 1)
    }

    var right = 1
    for (i <- nums.length - 1 to 0 by -1) {
      result(i) *= right
      right *= nums(i)
    }

    result
  }
}
