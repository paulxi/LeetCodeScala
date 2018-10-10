package com.leetcode.algorithm.medium.ContainerWithMostWater

object Solution {
  def maxArea(height: Array[Int]): Int = {
    if (height.length < 2) {
      0
    } else {
      var result = 0
      var i = 0
      var j = height.length - 1
      while (i < j) {
        result = Math.max(result, Math.min(height(i), height(j)) * (j - i))
        if (height(i) < height(j)) {
          i += 1
        } else {
          j -= 1
        }
      }

      result
    }
  }
}
