package com.leetcode.algorithm.medium.LongestPalindrome

object Solution {
  def longestPalindrome(s: String): String = {
    var result = ""

    for (i <- 0 until s.length()) {
      val palindrome1 = findPalindrome(s, i, i)
      val palindrome2 = findPalindrome(s, i, i + 1)

      if (palindrome1.length > result.length) {
        result = palindrome1
      }

      if (palindrome2.length > result.length) {
        result = palindrome2
      }
    }

    result
  }

  private def findPalindrome(s: String, leftStartIndex: Int, rightStartIndex: Int): String = {
    var left = leftStartIndex
    var right = rightStartIndex
    val strLength = s.length
    var result: StringBuilder = StringBuilder.newBuilder
    var flag = true

    while (left >= 0 && right < strLength && flag) {
      val leftChar = s.charAt(left)
      val rightChar = s.charAt(right)

      if (leftChar == rightChar) {
        result = result.append(rightChar)

        if (left != right) {
          result = result.insert(0, leftChar)
        }

        left += -1
        right += 1
      } else {
        flag = false
      }
    }

    result.toString
  }
}
