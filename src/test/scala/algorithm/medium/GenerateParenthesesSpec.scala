package com.leetcode.algorithm.medium.GenerateParentheses

import com.leetcode.algorithm.medium.GenerateParentheses.Solution._
import org.scalatest._

class GenerateParenthesesSpec extends FlatSpec with Matchers {
  "n = 3" should "return ['((()))', '(()())', '(())()', '()(())', '()()()']" in {
    generateParenthesis(3).toSet shouldEqual
      Array(
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
      ).toSet
  }

}
