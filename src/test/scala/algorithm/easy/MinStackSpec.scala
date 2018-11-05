package com.leetcode.algorithm.easy

import org.scalatest._

class MinStackSpec extends FlatSpec with Matchers {
  "MinStack" should "work" in {
    val minStack = new MinStack
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    minStack.getMin shouldEqual -3
    minStack.pop
    minStack.top shouldEqual 0
    minStack.getMin shouldEqual -2
  }

}
