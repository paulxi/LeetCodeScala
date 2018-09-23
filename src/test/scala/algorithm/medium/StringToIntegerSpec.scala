package com.leetcode.algorithm.medium.StringToInteger

import com.leetcode.algorithm.medium.StringToInteger.Solution._
import org.scalatest._

class StringToIntegerSpec extends FlatSpec with Matchers {
  "'42'" should "return 42" in {
    myAtoi("42") shouldEqual 42
  }

  "'   -42'" should "return -42" in {
    myAtoi("42") shouldEqual 42
  }

  "'4193 with words'" should "return 4193" in {
    myAtoi("4193 with words") shouldEqual 4193
  }

  "'words and 987'" should "return 0" in {
    myAtoi("words and 987") shouldEqual 0
  }

  "'-91283472332'" should "return -2147483648" in {
    myAtoi("-91283472332") shouldEqual -2147483648
  }
}
