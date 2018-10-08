package com.leetcode.algorithm.easy.LinkedListCycle

import com.leetcode.algorithm.common.ListNode
import com.leetcode.algorithm.easy.LinkedListCycle.Solution._
import org.scalatest._


class LinkedListCycleSpec extends FlatSpec with Matchers {
  "1->2->3->4->5->NULL" should "return false" in {
    val listNode = new ListNode(1)
    listNode.next = new ListNode(2)
    listNode.next.next = new ListNode(3)
    listNode.next.next.next = new ListNode(4)
    listNode.next.next.next.next = new ListNode(5)

    hasCycle(listNode) shouldEqual false
  }

  "1->2->3->4->1" should "return true" in {
    val listNode = new ListNode(1)
    listNode.next = new ListNode(2)
    listNode.next.next = new ListNode(3)
    listNode.next.next.next = new ListNode(4)
    listNode.next.next.next.next = listNode

    hasCycle(listNode) shouldEqual true
  }

}
