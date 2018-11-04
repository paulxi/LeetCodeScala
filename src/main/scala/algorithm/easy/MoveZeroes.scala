package com.leetcode.algorithm.easy.MoveZeroes

object Solution {
  def moveZeroes(nums: Array[Int]): Unit = {
    var currentPointer = 0
    for (num <- nums) {
      if (num != 0) {
        nums(currentPointer) = num
        currentPointer += 1
      }
    }

    for (i <- currentPointer until nums.length) {
      nums(i) = 0
    }
  }
}
