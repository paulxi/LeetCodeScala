package com.leetcode.algorithm.medium.LongestSubstringWithoutRepeatingCharacters

import com.leetcode.algorithm.medium.LongestSubstringWithoutRepeatingCharacters.Solution._
import org.scalatest._

class LongestSubstringWithoutRepeatingCharactersSpec extends FlatSpec with Matchers {
  "The Length of Longest Substring without Repeating Characters of ''" should "be 0" in {
    lengthOfLongestSubstring("") shouldEqual 0
  }

  "The Length of Longest Substring without Repeating Characters of 'abcabcbb'" should "be 3" in {
    lengthOfLongestSubstring("abcabcbb") shouldEqual 3
  }

  "The Length of Longest Substring without Repeating Characters of 'bbbbb'" should "be 1" in {
    lengthOfLongestSubstring("bbbbb") shouldEqual 1
  }

  "The Length of Longest Substring without Repeating Characters of 'pwwkew'" should "be 3" in {
    lengthOfLongestSubstring("pwwkew") shouldEqual 3
  }
}
