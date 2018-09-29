package com.leetcode.algorithm.easy.MaximumSubarray

object Solution {
  def maxSubArray(nums: Array[Int]): Int = {
    val result = nums.foldLeft[(Int, Int)]((Int.MinValue, Int.MinValue))((result, num) => {
      var (max, temp) = result
      if (temp < 0) {
        temp = num
      } else {
        temp += num
      }

      max = Math.max(max, temp)

      (max, temp)
    })

    result._1
  }
}
