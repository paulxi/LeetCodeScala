package com.leetcode.algorithm.medium.WordBreak

object Solution {
  def wordBreak(s: String, wordDict: List[String]): Boolean = {
    val wordSet = wordDict.toSet
    val dp = new Array[Boolean](s.length + 1)
    dp(0) = true

    for (i <- 1 to s.length) {
      (0 until i).find(j => dp(j) && wordSet.contains(s.substring(j, i))) match {
        case Some(_) => dp(i) = true
        case _       =>
      }
    }

    dp(s.length)
  }
}
