package com.leetcode.algorithm.hard.IntegerToEnglishWords

import com.leetcode.algorithm.hard.IntegerToEnglishWords.Solution._
import org.scalatest._

class IntegerToEnglishWordsSpec extends FlatSpec with Matchers {
  "Case 1" should "work" in {
    numberToWords(123) shouldEqual "One Hundred Twenty Three"
  }

  "Case 2" should "work" in {
    numberToWords(12345) shouldEqual "Twelve Thousand Three Hundred Forty Five"
  }

  "Case 3" should "work" in {
    numberToWords(1234567) shouldEqual "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
  }

  "Case 4" should "work" in {
    numberToWords(1234567891) shouldEqual "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"
  }

}
