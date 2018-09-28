package com.leetcode.algorithm.hard.MergeKSortedLists

import com.leetcode.algorithm.common.ListNode
import com.leetcode.algorithm.hard.MergeKSortedLists.Solution._
import org.scalatest._

class MergeKSortedListsSpec extends FlatSpec with Matchers {
  "Merge K Sorted Lists" should "return list 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6" in {
    val l1 = new ListNode(1)
    l1.next = new ListNode(4)
    l1.next.next = new ListNode(5)

    val l2 = new ListNode(1)
    l2.next = new ListNode(3)
    l2.next.next = new ListNode(4)

    val l3 = new ListNode(2)
    l3.next = new ListNode(6)

    val result = new ListNode(1);
    result.next = new ListNode(1);
    result.next.next = new ListNode(2);
    result.next.next.next = new ListNode(3);
    result.next.next.next.next = new ListNode(4);
    result.next.next.next.next.next = new ListNode(4);
    result.next.next.next.next.next.next = new ListNode(5);
    result.next.next.next.next.next.next.next = new ListNode(6);

    mergeKLists(Array(l1, l2, l3)) shouldEqual result
  }

}
