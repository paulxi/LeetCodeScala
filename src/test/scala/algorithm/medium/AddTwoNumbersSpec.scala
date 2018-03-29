package com.leetcode.algorithm.medium.AddTwoNumbers

import com.leetcode.algorithm.medium.AddTwoNumbers.Solution._
import org.scalatest._

class AddTwoNumbersSpec extends FlatSpec with Matchers {
  "Add Two Numbers" should "return list 7 -> 0 -> 8" in {
    val l1 = new ListNode(2)
    l1.next = new ListNode(4)
    l1.next.next = new ListNode(3)

    val l2 = new ListNode(5)
    l2.next = new ListNode(6)
    l2.next.next = new ListNode(4)

    val result = new ListNode(7)
    result.next = new ListNode(0)
    result.next.next = new ListNode(8)

    addTwoNumbers(l1, l2) shouldEqual result
  }

  "Add Two Numbers" should "return list 9" in {
    val l1 = new ListNode(8)
    val l2 = new ListNode(1)

    val result = new ListNode(9)

    addTwoNumbers(l1, l2) shouldEqual result
  }

  "Add Two Numbers" should "return list 0 -> 1" in {
    val l1 = new ListNode(9)
    val l2 = new ListNode(1)

    val result = new ListNode(0)
    result.next = new ListNode(1)

    addTwoNumbers(l1, l2) shouldEqual result
  }

  "Add Two Numbers" should "return list 0 -> 0 -> 1" in {
    val l1 = new ListNode(9)
    l1.next = new ListNode(9)

    val l2 = new ListNode(1)

    val result = new ListNode(0)
    result.next = new ListNode(0)
    result.next.next = new ListNode(1)

    addTwoNumbers(l1, l2) shouldEqual result
  }


}
