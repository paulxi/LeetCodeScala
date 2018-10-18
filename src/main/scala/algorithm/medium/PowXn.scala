package com.leetcode.algorithm.medium.PowXn

object Solution {
  def myPow(x: Double, n: Int): Double = {
    val num = if (n < 0) 1/x else x
    val power = if (n < 0) -(n.toLong) else n.toLong

    var result = 1.0
    var product = num
    var i = power
    while (i > 0) {
      if (i % 2 == 1) {
        result *= product
      }
      product *= product

      i /= 2
    }

    result
  }
}
