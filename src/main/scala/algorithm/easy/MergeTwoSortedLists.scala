package com.leetcode.algorithm.easy.MergeTwoSortedLists

import com.leetcode.algorithm.common.ListNode

object Solution {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) {
      l2
    } else if (l2 == null) {
      l1
    } else {
      var node1 = l1
      var node2 = l2
      val result = new ListNode(0)
      var ptr = result

      while (node1 != null && node2 != null) {
        val value = Math.min(node1.x, node2.x)
        ptr.next = new ListNode(value)
        ptr = ptr.next

        if (node1.x < node2.x) {
          node1 = node1.next
        } else {
          node2 = node2.next
        }
      }

      if (node1 != null) {
        ptr.next = node1
      }
      if (node2 != null) {
        ptr.next = node2
      }

      result.next
    }
  }
}
