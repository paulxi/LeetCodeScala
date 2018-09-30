package com.leetcode.algorithm.medium.CopyListWithRandomPointer

import com.leetcode.algorithm.common.RandomListNode
import scala.collection.mutable.Map

object Solution {
  def copyRandomList(head: RandomListNode): RandomListNode = {
    if (head == null) {
      null
    } else {
      val visitedNodes: Map[RandomListNode, RandomListNode] = Map[RandomListNode, RandomListNode]()
      var oldNode = head
      var newNode = new RandomListNode(oldNode.label)
      visitedNodes(oldNode) = newNode

      while (oldNode != null) {
        newNode.random = getClonedNode(visitedNodes, oldNode.random)
        newNode.next = getClonedNode(visitedNodes, oldNode.next)

        oldNode = oldNode.next
        newNode = newNode.next
      }

      visitedNodes(head)
    }
  }

  private def getClonedNode(visitedNodes: Map[RandomListNode, RandomListNode], node: RandomListNode): RandomListNode = {
    if (node == null) {
      null
    } else {
      val clonedNode = visitedNodes.getOrElse(node, new RandomListNode(node.label))
      visitedNodes(node) = clonedNode
      clonedNode
    }
  }
}
