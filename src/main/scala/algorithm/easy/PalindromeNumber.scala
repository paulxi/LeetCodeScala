package com.leetcode.algorithm.easy.PalindromeNumber

import scala.annotation.tailrec

object Solution {
  def isPalindrome(x: Int): Boolean = {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      false
    } else {
      val result = reverse(x, 0)
      val num = result._1
      val reversed = result._2

      num == reversed || num == reversed / 10
    }
  }

  @tailrec
  def reverse(num: Int, reversed: Int): (Int, Int) = {
    if (num > reversed) {
      reverse(num / 10, reversed * 10 + num % 10)
    } else {
      (num, reversed)
    }
  }
}
