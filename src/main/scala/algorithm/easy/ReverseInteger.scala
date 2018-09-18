package com.leetcode.algorithm.easy.ReverseInteger

object Solution {
  def reverse(x: Int): Int = {
    val posRemainder = Int.MaxValue % 10
    val negRemainder = Int.MinValue % 10

    def internalReverse(rev: Int, num: Int): Int = {
      if (num == 0) {
        return rev
      }

      val pos = num % 10
      if (rev > Int.MaxValue / 10 || (rev == Int.MaxValue / 10 && pos > posRemainder)) {
        return 0
      }

      if (rev < Int.MinValue / 10 || (rev == Int.MinValue / 10 && pos < negRemainder)) {
        return 0
      }

      internalReverse(rev * 10 + pos, num / 10)
    }

    internalReverse(0, x)
  }
}
