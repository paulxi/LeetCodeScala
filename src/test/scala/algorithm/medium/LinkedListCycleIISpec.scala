package com.leetcode.algorithm.medium.LinkedListCycleII

import com.leetcode.algorithm.common.ListNode
import com.leetcode.algorithm.medium.LinkedListCycleII.Solution._
import org.scalatest._

class LinkedListCycleIISpec extends FlatSpec with Matchers {
  "1->2->3->4->5->NULL" should "return false" in {
    val listNode = new ListNode(1)
    listNode.next = new ListNode(2)
    listNode.next.next = new ListNode(3)
    listNode.next.next.next = new ListNode(4)
    listNode.next.next.next.next = new ListNode(5)

    detectCycle(listNode) shouldEqual null
  }

  "1->2->3->4->1" should "return true" in {
    val listNode = new ListNode(1)
    listNode.next = new ListNode(2)
    listNode.next.next = new ListNode(3)
    listNode.next.next.next = new ListNode(4)
    listNode.next.next.next.next = listNode.next

    detectCycle(listNode) shouldBe listNode.next
  }
}
