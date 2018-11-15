package com.leetcode.algorithm.medium.BinaryTreeLevelOrderTraversal

import com.leetcode.algorithm.common.TreeNode
import com.leetcode.algorithm.medium.BinaryTreeLevelOrderTraversal.Solution._
import org.scalatest._

class BinaryTreeLevelOrderTraversalSpec extends FlatSpec with Matchers {
  "[3,9,20,null,null,15,7]" should "return [[3],[9,20],[15,7]]" in {
    val root = new TreeNode(3)
    root.left = new TreeNode(9)
    root.right = new TreeNode(20)
    root.right.left = new TreeNode(15)
    root.right.right = new TreeNode(7)
    levelOrder(root) shouldEqual List(3) :: List(9, 20) :: List(15, 7) :: Nil
  }
}
