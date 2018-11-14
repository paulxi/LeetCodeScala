package com.leetcode.algorithm.medium.FindTheDuplicateNumber

object Solution {
  def findDuplicate(nums: Array[Int]): Int = {
    var slow = nums(0)
    var fast = nums(0)

    slow = nums(slow)
    fast = nums(nums(fast))

    while (slow != fast) {
      slow = nums(slow)
      fast = nums(nums(fast))
    }

    var ptr = nums(0)
    while (ptr != slow) {
      ptr = nums(ptr)
      slow = nums(slow)
    }

    ptr
  }
}
