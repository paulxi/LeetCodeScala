package com.leetcode.algorithm.common

class TreeNode(var _x: Int = 0) {
  var x: Int = _x
  var left: TreeNode = null
  var right: TreeNode = null


  def canEqual(other: Any): Boolean = other.isInstanceOf[TreeNode]

  override def equals(other: Any): Boolean = other match {
    case that: TreeNode =>
      (that canEqual this) &&
        x == that.x &&
        left == that.left &&
        right == that.right
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(x, left, right)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
