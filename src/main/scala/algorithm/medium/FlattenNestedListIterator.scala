package com.leetcode.algorithm.medium.FlattenNestedListIterator

import com.leetcode.algorithm.common.NestedInteger

class NestedIterator(nestedList: List[NestedInteger]) extends Iterator[Int] {

  var stack: List[NestedInteger] = nestedList.map((elem) => elem)

  override def next(): Int = {
    val intValue = stack.head.getInteger
    stack = stack.tail
    intValue
  }

  override def hasNext: Boolean = {
    while (!stack.isEmpty) {
      val elem = stack.head
      if (elem.isInteger) {
        return true
      } else {
        stack = stack.tail
        stack = elem.getList ::: stack
      }
    }

    false
  }
}
