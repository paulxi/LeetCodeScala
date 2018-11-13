package com.leetcode.algorithm.hard.LargestRectangleInHistogram

import com.leetcode.algorithm.hard.LargestRectangleInHistogram.Solution._
import org.scalatest._

class LargestRectangleInHistogramSpec extends FlatSpec with Matchers {
  "[2,1,5,6,2,3]" should "return 10" in {
    largestRectangleArea(Array(2, 1, 5, 6, 2, 3)) shouldEqual 10
  }

  "[0, 0, 0, 0, 0, 0, 0, 0, 2147483647]" should "return 2147483647" in {
    largestRectangleArea(Array(0, 0, 0, 0, 0, 0, 0, 0, 2147483647)) shouldEqual 2147483647
  }
}
