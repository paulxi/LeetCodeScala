package com.leetcode.algorithm.medium.KthLargestElementInAnArray

object Solution {
  def findKthLargest(nums: Array[Int], k: Int): Int = {
    val heap: scala.collection.mutable.PriorityQueue[Int] =
      new scala.collection.mutable.PriorityQueue[Int]()(Ordering.Int.reverse)

    for (num <- nums) {
      if (heap.size < k) {
        heap += num
      } else {
        if (num > heap.head) {
          heap += num
          heap.dequeue()
        }
      }
    }

    heap.head
  }
}
