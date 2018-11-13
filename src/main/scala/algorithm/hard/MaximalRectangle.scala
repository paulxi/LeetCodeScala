package com.leetcode.algorithm.hard.MaximalRectangle

object Solution {
  def maximalRectangle(matrix: Array[Array[Char]]): Int = {
    if (matrix.length == 0 || matrix(0).length == 0) {
      0
    } else {
      val heights: Array[Int] = new Array[Int](matrix(0).length)
      var result = 0
      for (i <- 0 until matrix.length) {
        for (j <- 0 until matrix(i).length) {
          if (matrix(i)(j) == '1') {
            heights(j) += 1
          } else {
            heights(j) = 0
          }
        }

        result = Math.max(result, largestRectangleArea(heights))
      }

      result
    }
  }

  private def largestRectangleArea(heights: Array[Int]): Int = {
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
