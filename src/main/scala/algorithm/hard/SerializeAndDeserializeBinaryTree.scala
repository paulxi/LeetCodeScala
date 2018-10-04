package com.leetcode.algorithm.hard.SerializeAndDeserializeBinaryTree

import com.leetcode.algorithm.common.TreeNode

class Codec {
  def serialize(root: TreeNode): String = {
    if (root == null) {
      "[null]"
    } else {
      val result = rserialize(root, "")
      "[" + result.substring(0, result.length - 1) + "]"
    }
  }

  private def rserialize(root: TreeNode, str: String): String = {
    if (root == null) {
      str + "null,"
    } else {
      var result = str + root.x + ","
      result = rserialize(root.left, result)
      result = rserialize(root.right, result)

      result
    }
  }

  def deserialize(data: String): TreeNode = {
    if (data.length == 0) {
      null
    } else {
      val str = data.substring(1, data.length - 1)
      rdeserialize(str.split(","))._1
    }
  }

  private def rdeserialize(list: Array[String]): (TreeNode, Array[String]) = {
    val head = list.head
    if (head.equals("null")) {
      (null, list.tail)
    } else {
      val node = new TreeNode(Integer.valueOf(head))
      var tail = list.tail
      var result = rdeserialize(tail)
      node.left = result._1
      tail = result._2
      result = rdeserialize(tail)
      node.right = result._1
      tail = result._2
      (node, tail)
    }
  }
}
