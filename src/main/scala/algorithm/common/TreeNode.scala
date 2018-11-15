package com.leetcode.algorithm.common

class TreeNode(var _value: Int = 0) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null


  def canEqual(other: Any): Boolean = other.isInstanceOf[TreeNode]

  override def equals(other: Any): Boolean = other match {
    case that: TreeNode =>
      (that canEqual this) &&
        value == that.value &&
        left == that.left &&
        right == that.right
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value, left, right)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
