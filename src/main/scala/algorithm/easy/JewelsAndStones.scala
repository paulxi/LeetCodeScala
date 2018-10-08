package com.leetcode.algorithm.easy.JewelsAndStones

object Solution {
  def numJewelsInStones(jewels: String, stones: String): Int = {
    val set = jewels.toCharArray.toSet

    stones.filter({
      set.contains(_)
    }).length
  }
}
