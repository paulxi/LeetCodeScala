package com.leetcode.algorithm.hard.RemoveInvalidParentheses

object Solution {
  import scala.collection.mutable.MutableList

  def removeInvalidParentheses(s: String): List[String] = {
    val ans: MutableList[String] = MutableList()
    remove(s, ans, 0, 0, Array('(', ')'))
    ans.toList
  }

  private def remove(s: String, ans: MutableList[String], last_i: Int, last_j: Int, par: Array[Char]): Unit = {
    var stack = 0
    for (i <- last_i until s.length) {
      if (s.charAt(i) == par(0)) {
        stack += 1
      }
      if (s.charAt(i) == par(1)) {
        stack -= 1
      }
      if (stack < 0) {
        for (j <- last_j to i) {
          if (s.charAt(j) == par(1) && (j == last_j || s.charAt(j - 1) != par(1))) {
            remove(s.substring(0, j) + s.substring(j + 1), ans, i, j, par)
          }
        }

        return
      }
    }

    val reversed = s.reverse.toString
    if (par(0) == '(') {
      remove(reversed, ans, 0, 0, Array(')', '('))
    } else {
      ans += reversed
    }
  }
}
