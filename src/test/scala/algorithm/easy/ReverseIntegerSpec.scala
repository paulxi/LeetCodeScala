package com.leetcode.algorithm.easy.ReverseInteger

import com.leetcode.algorithm.easy.ReverseInteger.Solution._
import org.scalatest._

class ReverseIntegerSpec extends FlatSpec with Matchers {
  "123" should "return 321" in {
    reverse(123) shouldEqual 321
  }

  "-123" should "return -321" in {
    reverse(-123) shouldEqual -321
  }

  "120" should "return 21" in {
    reverse(120) shouldEqual 21
  }

  "1534236469" should "return 0" in {
    reverse(1534236469) shouldEqual 0
  }

}
