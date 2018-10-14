package com.leetcode.algorithm.easy.MergeSortedArray

import com.leetcode.algorithm.easy.MergeSortedArray.Solution._
import org.scalatest._

class MergeSortedArraySpec extends FlatSpec with Matchers {
  "[1,2,3,0,0,0], m = 3 and [2,5,6], n = 3" should "return [1,2,2,3,5,6]" in {
    val nums1 = Array(1, 2, 3, 0, 0, 0)
    val nums2 = Array(2, 5, 6)
    merge(nums1, 3, nums2, 3)
    nums1 shouldEqual Array(1, 2, 2, 3, 5, 6)
  }
}
