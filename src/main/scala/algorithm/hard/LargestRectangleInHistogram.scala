package com.leetcode.algorithm.hard.LargestRectangleInHistogram

object Solution {
  def largestRectangleArea(heights: Array[Int]): Int = {
    if (heights.length == 0) {
      0
    } else if (heights.length == 1) {
      heights(0)
    } else {
      val lessFromLeft = new Array[Int](heights.length)
      val lessFromRight = new Array[Int](heights.length)
      lessFromLeft(0) = -1
      lessFromRight(heights.length - 1) = heights.length

      for (i <- 1 until heights.length) {
        var p = i - 1
        while (p >= 0 && heights(p) >= heights(i)) {
          p = lessFromLeft(p)
        }
        lessFromLeft(i) = p
      }

      for (i <- heights.length - 2 to 0 by -1) {
        var p = i + 1
        while (p < heights.length && heights(p) >= heights(i)) {
          p = lessFromRight(p)
        }
        lessFromRight(i) = p
      }

      var maxArea = 0
      for (i <- 0 until heights.length) {
        maxArea = Math.max(maxArea, heights(i) * (lessFromRight(i) - lessFromLeft(i) - 1))
      }

      maxArea
    }
  }
}
