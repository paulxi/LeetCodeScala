package com.leetcode.algorithm.medium.BinaryTreeLevelOrderTraversal

import com.leetcode.algorithm.common.TreeNode

object Solution {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    var result: List[List[Int]] = Nil
    if (root != null) {
      var queue: List[TreeNode] = root :: Nil
      while (!queue.isEmpty) {
        var subList: List[Int] = Nil
        val size = queue.length

        for (_ <- 0 until size) {
          val node = queue.head
          queue = queue.tail
          subList = subList :+ node.value

          if (node.left != null) {
            queue = queue :+ node.left
          }
          if (node.right != null) {
            queue = queue :+ node.right
          }
        }

        result = result :+ subList
      }

    }

    result
  }
}
