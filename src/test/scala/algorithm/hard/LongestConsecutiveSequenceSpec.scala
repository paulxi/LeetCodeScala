package com.leetcode.algorithm.hard.LongestConsecutiveSequence

import com.leetcode.algorithm.hard.LongestConsecutiveSequence.Solution._
import org.scalatest._

class LongestConsecutiveSequenceSpec extends FlatSpec with Matchers {
  "[100, 4, 200, 1, 3, 2]" should "return 4" in {
    longestConsecutive(Array(100, 4, 200, 1, 3, 2)) shouldEqual 4
  }
}
