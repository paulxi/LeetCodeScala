package com.leetcode.algorithm.hard.MinimumWindowSubstring

import com.leetcode.algorithm.hard.MinimumWindowSubstring.Solution._
import org.scalatest._

class MinimumWindowSubstringSpec extends FlatSpec with Matchers {
  "S = 'ADOBECODEBANC', T = 'ABC'" should "return 'BANC'" in {
    minWindow("ADOBECODEBANC", "ABC") shouldEqual "BANC"
  }

  "S = 'aa', T = 'aa'" should "return 'aa'" in {
    minWindow("aa", "aa") shouldEqual "aa"
  }
}
