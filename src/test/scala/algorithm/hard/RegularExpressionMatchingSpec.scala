package com.leetcode.algorithm.hard.RegularExpressionMatching

import com.leetcode.algorithm.hard.RegularExpressionMatching.Solution._
import org.scalatest._

class RegularExpressionMatchingSpec extends FlatSpec with Matchers {
  "Case 1" should "return false" in {
    isMatch("aa", "a") shouldEqual false
  }

  "Case 2" should "return true" in {
    isMatch("aa", "a*") shouldEqual true
  }

  "Case 3" should "return true" in {
    isMatch("ab", ".*") shouldEqual true
  }

  "Case 4" should "return true" in {
    isMatch("aab", "c*a*b") shouldEqual true
  }

  "Case 5" should "return false" in {
    isMatch("mississippi", "mis*is*p*.") shouldEqual false
  }

  "Case 6" should "return true" in {
    isMatch("aaa", "a*") shouldEqual true
  }

  "Case 7" should "return false" in {
    isMatch("mississippi", "mis*is*ip*.") shouldEqual true
  }

}
