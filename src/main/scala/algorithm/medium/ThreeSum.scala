package com.leetcode.algorithm.medium.ThreeSum

object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    if (nums.length <= 2) {
      return List()
    }

    val sortedNums = nums.sorted

    var result: List[List[Int]] = List()
    for { i <- 0 until sortedNums.length - 2 } {
      if (i == 0 || sortedNums(i) != sortedNums(i - 1)) {
        val sum = 0 - sortedNums(i)
        var lo = i + 1
        var hi = sortedNums.length - 1

        while (lo < hi) {
          if (sortedNums(lo) + sortedNums(hi) == sum) {
            result = result :+ List(sortedNums(i), sortedNums(lo), sortedNums(hi))

            while (lo < hi && sortedNums(lo) == sortedNums(lo + 1)) lo += 1
            while( lo < hi && sortedNums(hi) == sortedNums(hi - 1)) hi -= 1

            lo += 1
            hi -= 1
          } else if (sortedNums(lo) + sortedNums(hi) < sum) {
            lo += 1
          } else {
            hi -= 1
          }
        }
      }
    }

    result
  }
}
