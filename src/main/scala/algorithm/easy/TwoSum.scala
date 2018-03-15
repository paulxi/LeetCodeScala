package com.leetcode.algorithm.easy.TwoSum

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var map = Map[Int, Int]()
    for ((item, index) <- nums.zipWithIndex) {
      val value = target - item
      if (map.contains(value)) return Array(map(value), index)
      map = map + (item -> index)
    }

    Array()
  }
}
