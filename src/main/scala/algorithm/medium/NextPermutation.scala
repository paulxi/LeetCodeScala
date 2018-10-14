package com.leetcode.algorithm.medium.NextPermutation

object Solution {
  def nextPermutation(nums: Array[Int]): Unit = {
    var i = nums.length - 2
    while (i >= 0 && nums(i) >= nums(i + 1)) {
      i -= 1
    }

    if (i >= 0) {
      var j = nums.length - 1
      while (j >= 0 && nums(i) >= nums(j)) {
        j -= 1
      }
      swap(nums, i, j)
    }

    i += 1
    var k = nums.length - 1
    while (i < k) {
      swap(nums, i, k)
      i += 1
      k -= 1
    }
  }

  def swap(nums: Array[Int], i: Int, j: Int): Unit = {
    val temp = nums(i)
    nums(i) = nums(j)
    nums(j) = temp
  }
}
