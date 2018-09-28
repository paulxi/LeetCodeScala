package com.leetcode.algorithm.hard.MergeKSortedLists

import com.leetcode.algorithm.common.ListNode

object Solution {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    val queue = scala.collection.mutable.PriorityQueue[ListNode]()(Ordering.by[ListNode, Int](_.x).reverse)

    for (node <- lists if node != null) {
      queue += node
    }

    var result: ListNode = null
    var previous: ListNode = null
    while (!queue.isEmpty) {
      val node = queue.dequeue()
      if (result == null) {
        result = node
      } else {
        previous.next = node
      }

      if (node.next != null) {
        queue += node.next
      }

      previous = node
    }

    result
  }
}
