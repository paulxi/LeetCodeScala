package com.leetcode.algorithm.hard.KEmptySlots

import com.leetcode.algorithm.hard.KEmptySlots.Solution._
import org.scalatest._

class KEmptySlotsSpec extends FlatSpec with Matchers {
  "flowers: [1,3,2] k: 1" should "return 2" in {
    kEmptySlots(Array(1, 3, 2), 1) shouldEqual 2
  }

  "flowers: [1,2,3] k: 1" should "return -1" in {
    kEmptySlots(Array(1,2,3), 1) shouldEqual -1
  }

  "flowers: [6, 5, 8, 9, 7, 1, 10, 2, 3, 4] k: 2" should "return 8" in {
    kEmptySlots(Array(6, 5, 8, 9, 7, 1, 10, 2, 3, 4), 2) shouldEqual 8
  }
}
