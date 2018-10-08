package com.leetcode.algorithm.easy.LinkedListCycle

import com.leetcode.algorithm.common.ListNode

object Solution {
  def hasCycle(head: ListNode): Boolean = {
    if (head == null || head.next == null) {
      false
    } else {
      var slow = head
      var fast = head.next
      while (!(slow eq fast)) {
        if (fast == null || fast.next == null) {
          return false
        }

        slow = slow.next
        fast = fast.next.next
      }

      true
    }
  }
}
