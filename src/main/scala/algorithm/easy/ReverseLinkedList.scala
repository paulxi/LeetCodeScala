package com.leetcode.algorithm.easy.ReverseLinkedList

import com.leetcode.algorithm.common.ListNode

object Solution {
  def reverseList(head: ListNode): ListNode = {
//    var curr = head
//    var prev: ListNode = null
//    while (curr != null) {
//      var temp = curr.next
//      curr.next = prev
//      prev = curr
//      curr = temp
//    }
//
//    prev

    if (head == null || head.next == null) {
      head
    } else {
      val result = reverseList(head.next)
      head.next.next = head
      head.next = null
      result
    }
  }
}

