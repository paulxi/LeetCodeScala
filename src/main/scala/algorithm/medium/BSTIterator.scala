package com.leetcode.algorithm.medium

import com.leetcode.algorithm.common.TreeNode

class BSTIterator(val root: TreeNode) {
  var stack: List[TreeNode] = Nil
  pushLeftChildren(root)

  def hasNext: Boolean = {
    stack.nonEmpty
  }

  def next: Int = {
    if (stack.isEmpty) {
      Int.MinValue
    } else {
      val node = stack.head
      stack = stack.tail
      pushLeftChildren(node.right)

      node.x
    }
  }

  private def pushLeftChildren(node: TreeNode): Unit = {
    if (node != null) {
      stack = node :: stack
      pushLeftChildren(node.left)
    }
  }
}
