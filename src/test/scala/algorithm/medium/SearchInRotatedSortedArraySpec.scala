package com.leetcode.algorithm.medium.SearchInRotatedSortedArray

import com.leetcode.algorithm.medium.SearchInRotatedSortedArray.Solution._
import org.scalatest._

class SearchInRotatedSortedArraySpec extends FlatSpec with Matchers {
  "nums = [4,5,6,7,0,1,2], target = 0" should "return 4" in {
    search(Array(4, 5, 6, 7, 0, 1, 2), 0) shouldEqual 4
  }

  "nums = [4,5,6,7,0,1,2], target = 3" should "return -1" in {
    search(Array(4, 5, 6, 7, 0, 1, 2), 3) shouldEqual -1
  }
}
