package com.leetcode.algorithm.medium.ThreeSum

import com.leetcode.algorithm.medium.ThreeSum.Solution._
import org.scalatest._

class ThreeSumSpec extends FlatSpec with Matchers {
  "[-1, 0, 1, 2, -1, -4]" should "return [[-1, 0, 1], [-1, -1, 2]]" in {
    val result = threeSum(Array(-1, 0, 1, 2, -1, -4))
    val expected = Set(List(-1, 0, 1), List(-1, -1, 2))
    result.toSet shouldEqual(expected)
  }
}
