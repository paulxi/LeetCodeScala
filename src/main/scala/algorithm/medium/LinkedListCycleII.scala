package com.leetcode.algorithm.medium.LinkedListCycleII

import com.leetcode.algorithm.common.ListNode

object Solution {
  def detectCycle(head: ListNode): ListNode = {
    var slow = head
    var fast = head
    slow = slow.next
    fast = fast.next.next

    var intersect: ListNode = null

    while (fast != null && fast.next != null && (fast ne slow)) {
      slow = slow.next
      fast = fast.next.next

      if (fast eq slow) {
        intersect = slow
      }
    }

    if (intersect == null) {
      null
    } else {
      var ptr = head
      while (ptr ne intersect) {
        ptr = ptr.next
        intersect = intersect.next
      }

      ptr
    }
  }
}
