package com.leetcode.algorithm.easy.MergeTwoSortedLists

import com.leetcode.algorithm.common.ListNode
import com.leetcode.algorithm.easy.MergeTwoSortedLists.Solution._
import org.scalatest._

class MergeTwoSortedListsSpec extends FlatSpec with Matchers {
  "1->2->4 and 1->3->4" should "return 1->1->2->3->4->4" in {
    val l1 = new ListNode(1)
    l1.next = new ListNode(2)
    l1.next.next = new ListNode(4)

    val l2 = new ListNode(1)
    l2.next = new ListNode(3)
    l2.next.next = new ListNode(4)

    val expected = new ListNode(1)
    expected.next = new ListNode(1)
    expected.next.next = new ListNode(2)
    expected.next.next.next = new ListNode(3)
    expected.next.next.next.next = new ListNode(4)
    expected.next.next.next.next.next = new ListNode(4)

    mergeTwoLists(l1, l2) shouldEqual expected
  }

}
