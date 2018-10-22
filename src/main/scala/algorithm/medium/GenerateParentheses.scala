package com.leetcode.algorithm.medium.GenerateParentheses

object Solution {
  def generateParenthesis(n: Int): List[String] = {
    n match {
      case 0 => Nil
      case 1 => "()" :: Nil
      case _ => {
        val previous = generateParenthesis(n - 1)
        var set: Set[String] = Set()
        for (item <- previous) {
          for (idx <- 0 until item.length) {
            val str = item.substring(0, idx) + "()" + item.substring(idx)
            if (!set.contains(str)) {
              set += str
            }
          }
        }

        set.toList
      }
    }
  }
}
