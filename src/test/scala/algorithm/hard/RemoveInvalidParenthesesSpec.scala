package com.leetcode.algorithm.hard.RemoveInvalidParentheses

import com.leetcode.algorithm.hard.RemoveInvalidParentheses.Solution._

import org.scalatest._

class RemoveInvalidParenthesesSpec extends FlatSpec with Matchers {
  "'()())()'" should "return ['()()()', '(())()']" in {
    removeInvalidParentheses("()())()").toSet shouldEqual Array("()()()", "(())()").toSet
  }

  "'(a)())()'" should "return ['(a)()()', '(a())()']" in {
    removeInvalidParentheses("(a)())()").toSet shouldEqual Array("(a)()()", "(a())()").toSet
  }

  "')('" should "return ['']" in {
    removeInvalidParentheses(")(").toSet shouldEqual Array("").toSet
  }
}
