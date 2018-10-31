package com.leetcode.algorithm.hard.LongestConsecutiveSequence

object Solution {
  def longestConsecutive(nums: Array[Int]): Int = {
    if (nums.length <= 1) {
      nums.length
    } else {
      val sorted = nums.sorted
      var last_i = 0
      var duplicated = 0
      var maxLength = 1

      for (i <- 1 until sorted.length) {
        if (sorted(i) == sorted(i - 1)) {
          duplicated += 1
        } else if (sorted(i) == sorted(i - 1) + 1) {
          val length = i - last_i - duplicated + 1
          maxLength = Math.max(maxLength, length)
        } else {
          last_i = i
          duplicated = 0
        }
      }

      maxLength
    }
  }
}

