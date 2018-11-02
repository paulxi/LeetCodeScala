package com.leetcode.algorithm.hard.BasicCalculate

object Solution {
  def calculate(s: String): Int = {
    var result = 0
    var number = 0
    var sign = 1
    var stack: List[Int] = Nil

    for (c <- s) {
      if (Character.isDigit(c)) {
        number = number * 10 + c - '0'
      } else if (c == '+') {
        result += sign * number
        number = 0
        sign = 1
      } else if (c == '-') {
        result += sign * number
        number = 0
        sign = -1
      } else if (c == '(') {
        stack = result :: stack
        stack = sign :: stack
        result = 0
        sign = 1
      } else if (c == ')') {
        result += sign * number
        number = 0
        result *= stack.head
        stack = stack.tail
        result += stack.head
        stack = stack.tail
      }
    }

    result += sign * number
    result
  }
}
