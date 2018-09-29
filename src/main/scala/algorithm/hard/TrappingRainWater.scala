package com.leetcode.algorithm.hard.TrappingRainWater

object Solution {
  def trap(height: Array[Int]): Int = {
    if (height.length <= 2) {
      0
    } else {
      val leftMax = new Array[Int](height.length)
      leftMax(0) = height(0)
      for (idx <- 1 until height.length) {
        leftMax(idx) = Math.max(leftMax(idx - 1), height(idx))
      }

      val rightMax = new Array[Int](height.length)
      rightMax(height.length - 1) = height(height.length - 1)
      for (idx <- height.length - 2 to 0 by -1) {
        rightMax(idx) = Math.max(rightMax(idx + 1), height(idx))
      }

      var result = 0
      for (idx <- 1 until height.length - 1) {
        result += Math.min(leftMax(idx), rightMax(idx)) - height(idx)
      }
      result
    }
  }
}
