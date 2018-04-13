package com.leetcode.algorithm.medium.LongestPalindrome

import com.leetcode.algorithm.medium.LongestPalindrome.Solution._
import org.scalatest._

class LongestPalindromeSpec extends FlatSpec with Matchers {
  "Empty string" should "return ''" in {
    longestPalindrome("") shouldEqual ""
  }

  "'a'" should "return 'a'" in {
    longestPalindrome("a") shouldEqual "a"
  }

  "'babad'" should "return 'bab'" in {
    longestPalindrome("babad") shouldEqual "bab"
  }

  "'cbbd'" should "return 'bb'" in {
    longestPalindrome("cbbd") shouldEqual "bb"
  }
}
