package com.leetcode.algorithm.hard

import com.leetcode.algorithm.hard.MedianOfTwoSortedArrays.Solution._
import org.scalatest._

class LRUCacheSpec extends FlatSpec with Matchers {
  "Case 1" should "work" in {
    val cache = new LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    cache.get(1) shouldEqual 1
    cache.put(3, 3)
    cache.get(2) shouldEqual -1
    cache.put(4, 4)
    cache.get(1) shouldEqual -1
    cache.get(3) shouldEqual 3
    cache.get(4) shouldEqual 4
  }
}
