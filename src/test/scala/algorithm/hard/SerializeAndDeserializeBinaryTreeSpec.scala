package com.leetcode.algorithm.hard.SerializeAndDeserializeBinaryTree

import com.leetcode.algorithm.common.TreeNode
import org.scalatest._

class SerializeAndDeserializeBinaryTreeSpec extends FlatSpec with Matchers {
  "Case 1" should "work" in {
    val codec = new Codec()
    val root = new TreeNode(1)
    root.left = new TreeNode(2)
    root.right = new TreeNode(5)
    root.left.left = new TreeNode(3)
    root.left.right = new TreeNode(4)

    val serializedStr = codec.serialize(root)
    serializedStr shouldEqual "[1,2,3,null,null,4,null,null,5,null,null]"
    root shouldEqual codec.deserialize(serializedStr)
  }
}
