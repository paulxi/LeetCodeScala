package com.leetcode.algorithm.medium

import com.leetcode.algorithm.common.TreeNode
import org.scalatest._

class BSTIteratorSpec extends FlatSpec with Matchers {
  "BST" should "return [3, 5, 7, 10, 12, 15, 17]" in {
    val values: Array[Int] = new Array(7)
    val root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.left = new TreeNode(12);
    root.right.right = new TreeNode(17);
    val iterator = new BSTIterator(root);
    var index = 0
    while (iterator.hasNext) {
      values(index) = iterator.next
      index += 1
    }

    values shouldEqual Array(3, 5, 7, 10, 12, 15, 17)
  }

}
