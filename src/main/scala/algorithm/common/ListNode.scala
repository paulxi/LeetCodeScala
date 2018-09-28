package com.leetcode.algorithm.common

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
