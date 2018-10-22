package com.leetcode.algorithm.easy.ReverseString

object Solution {
  def reverseString(s: String): String = {
    val chars = s.toCharArray
    for (i <- 0 until chars.length / 2) {
      val temp = chars(i)
      val j = chars.length - 1 - i
      chars(i) = chars(j)
      chars(j) = temp
    }

    new String(chars)
  }
}
