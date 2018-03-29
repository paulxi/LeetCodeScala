package com.leetcode.algorithm.hard.MedianOfTwoSortedArrays

import com.leetcode.algorithm.hard.MedianOfTwoSortedArrays.Solution._
import org.scalatest._

class MedianOfTwoSortedArraysSpec extends FlatSpec with Matchers {
  "Case 1" should "return 2.0" in {
    findMedianSortedArrays(Array(1, 2), Array(2)) shouldEqual 2.0
  }

  "Case 2" should "return 2.5" in {
    findMedianSortedArrays(Array(1, 2), Array(3, 4)) shouldEqual 2.5
  }

  "Case 3" should "return 2.5" in {
    findMedianSortedArrays(Array(3, 4), Array(1, 2)) shouldEqual 2.5
  }

  "Case 4" should "return 3.0" in {
    findMedianSortedArrays(Array(1, 2, 3), Array(4, 5)) shouldEqual 3.0
  }

  "Case 5" should "return 3.0" in {
    findMedianSortedArrays(Array(4, 5), Array(1, 2, 3)) shouldEqual 3.0
  }

  "Case 6" should "return 1.0" in {
    findMedianSortedArrays(Array(), Array(1)) shouldEqual 1.0
  }

  "Case 7" should "return 0.0" in {
    findMedianSortedArrays(Array(), Array()) shouldEqual 0.0
  }
}
