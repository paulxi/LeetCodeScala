package com.leetcode.algorithm.medium.AddTwoNumbers

import com.leetcode.algorithm.common.ListNode

object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) {
      return l2
    }

    if (l2 == null) {
      return l1
    }

    val l3 = add(l1, l2.x)
    l3.next = addTwoNumbers(l3.next, l2.next)
    l3
  }

  private def add(node: ListNode, value: Int): ListNode = {
    if (node == null) {
      return new ListNode(value)
    }

    val sum = node.x + value
    val result = new ListNode(sum % 10)

    if (sum < 10) {
      result.next = node.next
    } else {
      result.next = add(node.next, 1)
    }

    result
  }
}
