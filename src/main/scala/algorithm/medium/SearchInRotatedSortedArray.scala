package com.leetcode.algorithm.medium.SearchInRotatedSortedArray
import scala.annotation.tailrec

object Solution {
  def search(nums: Array[Int], target: Int): Int = {
    search(nums, 0, nums.length - 1, target)
  }

  @tailrec
  private def search(nums: Array[Int], low: Int, high: Int, target: Int): Int = {
    if (low <= high) {
      val mid = low + (high - low) / 2
      if (nums(mid) == target) {
        mid
      } else {
        val isLeftSorted = isSort(nums, low, mid)
        val isRightSorted = isSort(nums, mid, high)

        if (isLeftSorted && nums(low) <= target && target < nums(mid)) {
          search(nums, low, mid - 1, target)
        } else if (isRightSorted && nums(mid) < target && target <= nums(high)) {
          search(nums, mid + 1, high, target)
        } else {
          if (isLeftSorted) {
            search(nums, mid + 1, high, target)
          } else {
            search(nums, low, mid - 1, target)
          }
        }
      }
    } else {
      -1
    }
  }

  private def isSort(nums: Array[Int], low: Int, high: Int): Boolean = {
    nums(low) < nums(high) || low == high
  }
}
