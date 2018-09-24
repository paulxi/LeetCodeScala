package com.leetcode.algorithm.easy.ValidParentheses

import com.leetcode.algorithm.easy.ValidParentheses.Solution._
import org.scalatest._

class ValidParenthesesSpec extends FlatSpec with Matchers {
  "'()'" should "return true" in {
    isValid("()") shouldEqual true
  }

  "'()[]{}'" should "return true" in {
    isValid("()[]{}") shouldEqual true
  }

  "'(]'" should "return true" in {
    isValid("(]") shouldEqual false
  }

  "'([)]'" should "return true" in {
    isValid("([)]") shouldEqual false
  }

  "'{[]}'" should "return true" in {
    isValid("{[]}") shouldEqual true
  }

}
