package com.leetcode.algorithm.hard.RegularExpressionMatching

object Solution {
  def isMatch(s: String, p: String): Boolean = {
    val result = Array.ofDim[Boolean](s.length + 1, p.length + 1)

    result(0)(0) = true
    for {
      i <- 0 until p.length if p.charAt(i) == '*'
    }
      result(0)(i + 1) = result(0)(i - 1)

    for {
      i <- 0 until s.length
      j <- 0 until p.length
    }
      p.charAt(j) match {
        case '.' => result(i + 1)(j + 1) = result(i + 1)(j)
        case '*' => if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
          result(i + 1)(j + 1) = result(i + 1)(j - 1)
        } else {
          result(i + 1)(j + 1) = result(i + 1)(j - 1) || result(i + 1)(j) || result(i)(j + 1)
        }
        case _  => if (p.charAt(j) == s.charAt(i)) result(i + 1)(j + 1) = result(i)(j)
      }

    result(s.length)(p.length)
  }
}
