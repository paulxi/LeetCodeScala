package com.leetcode.algorithm.hard.BasicCalculate

import com.leetcode.algorithm.hard.BasicCalculate.Solution._
import org.scalatest._

class BasicCalculateSpec extends FlatSpec with Matchers {
  "'1 + 1'" should "return 2" in {
    calculate("1 + 1") shouldEqual 2
  }

  "' 2-1 + 2 '" should "return 3" in {
    calculate(" 2-1 + 2 ") shouldEqual 3
  }

  "'(1+(4+5+2)-3)+(6+8)'" should "return 23" in {
    calculate("(1+(4+5+2)-3)+(6+8)") shouldEqual 23
  }
}
