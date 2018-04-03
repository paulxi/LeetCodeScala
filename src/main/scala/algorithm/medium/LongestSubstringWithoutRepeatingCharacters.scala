package com.leetcode.algorithm.medium.LongestSubstringWithoutRepeatingCharacters

object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    val map: scala.collection.mutable.Map[Char, Int] = scala.collection.mutable.HashMap[Char, Int]().withDefaultValue(-1)
    var maxLength = 0
    var startIndex = 0
    var currentIndex = 0

    for (char <- s) {
      val pos = map(char)
      startIndex = scala.math.max(startIndex, pos + 1)
      maxLength = scala.math.max(maxLength, currentIndex - startIndex + 1)
      map(char) = currentIndex
      currentIndex += 1
    }

    maxLength
  }
}
