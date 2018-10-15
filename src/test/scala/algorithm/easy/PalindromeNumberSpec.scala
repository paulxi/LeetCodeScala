package com.leetcode.algorithm.easy.PalindromeNumber

import com.leetcode.algorithm.easy.PalindromeNumber.Solution._
import org.scalatest._

class PalindromeNumberSpec extends FlatSpec with Matchers {
  "121" should "return true" in {
    isPalindrome(121) shouldEqual true
  }

  "-121" should "return false" in {
    isPalindrome(-121) shouldEqual false
  }

  "10" should "return false" in {
    isPalindrome(10) shouldEqual false
  }
}

