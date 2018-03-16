package com.leetcode.algorithm.medium.AddTwoNumbers

class ListNode(var _x: Int = 0) {
   var next: ListNode = null
   var x: Int = _x


  def canEqual(other: Any): Boolean = other.isInstanceOf[ListNode]

  override def equals(other: Any): Boolean = other match {
    case that: ListNode =>
      (that canEqual this) &&
        next == that.next &&
        x == that.x
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(next, x)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

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
