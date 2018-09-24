package com.leetcode.algorithm.easy.ValidParentheses

object Solution {
  val parentheses: Map[Char, Char] = Map('}' -> '{', ')' -> '(', ']' -> '[')

  def isValid(s: String): Boolean = {
    var stack: List[Char] = Nil
    for (char <- s) {
      val value = parentheses.get(char)
      value match {
        case Some(x) => if (stack == Nil || stack.head != x) {
          return false
        } else {
          stack = stack.tail
        }
        case None => stack = char :: stack
      }
    }

    stack == Nil
  }
}
