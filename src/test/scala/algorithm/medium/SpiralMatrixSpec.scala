package com.leetcode.algorithm.medium.SpiralMatrix

import com.leetcode.algorithm.medium.SpiralMatrix.Solution._
import org.scalatest._

class SpiralMatrixSpec extends FlatSpec with Matchers {
  "[[ 1, 2, 3 ],[ 4, 5, 6 ],[ 7, 8, 9 ]]" should "return [1,2,3,6,9,8,7,4,5]" in {
    spiralOrder(Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))) shouldEqual
      Array(1, 2, 3, 6, 9, 8, 7, 4, 5)
  }

  "[[1, 2, 3, 4],[5, 6, 7, 8],[9,10,11,12]]" should "return [1,2,3,4,8,12,11,10,9,5,6,7]" in {
    spiralOrder(
      Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 10, 11, 12))
    ) shouldEqual
      Array(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
  }
}
