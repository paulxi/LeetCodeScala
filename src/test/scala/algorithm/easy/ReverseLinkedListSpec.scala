package com.leetcode.algorithm.easy.ReverseLinkedList

import com.leetcode.algorithm.common.ListNode
import com.leetcode.algorithm.easy.ReverseLinkedList.Solution._
import org.scalatest._

class ReverseLinkedListSpec extends FlatSpec with Matchers {
  "1->2->3->4->5->NULL" should "return 5->4->3->2->1->NULL" in {
    val listNode = new ListNode(1)
    listNode.next = new ListNode(2)
    listNode.next.next = new ListNode(3)
    listNode.next.next.next = new ListNode(4)
    listNode.next.next.next.next = new ListNode(5)

    val expected = new ListNode(5)
    expected.next = new ListNode(4)
    expected.next.next = new ListNode(3)
    expected.next.next.next = new ListNode(2)
    expected.next.next.next.next = new ListNode(1)

    reverseList(listNode) shouldEqual expected
  }

}
