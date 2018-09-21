package com.leetcode.algorithm.easy.RomanToInteger

import com.leetcode.algorithm.easy.RomanToInteger.Solution._
import org.scalatest._

class RomanToIntegerSpec extends FlatSpec with Matchers {
  "III" should "return 3" in {
    romanToInt("III") shouldEqual 3
  }

  "IV" should "return 4" in {
    romanToInt("IV") shouldEqual 4
  }

  "IX" should "return 9" in {
    romanToInt("IX") shouldEqual 9
  }

  "LVIII" should "return 58" in {
    romanToInt("LVIII") shouldEqual 58
  }

  "MCMXCIV" should "return 1994" in {
    romanToInt("MCMXCIV") shouldEqual 1994
  }
}
