package com.leetcode.algorithm.medium.KthLargestElementInAnArray

import com.leetcode.algorithm.medium.KthLargestElementInAnArray.Solution._
import org.scalatest._

class KthLargestElementInAnArraySpec extends FlatSpec with Matchers {
  "[3,2,1,5,6,4] and k = 2" should "return 5" in {
    findKthLargest(Array(3, 2, 1, 5, 6, 4), 2) shouldEqual 5
  }

  "[3,2,3,1,2,4,5,5,6] and k = 4" should "return 4" in {
    findKthLargest(Array(3, 2, 3, 1, 2, 4, 5, 5, 6), 4) shouldEqual 4
  }
}
