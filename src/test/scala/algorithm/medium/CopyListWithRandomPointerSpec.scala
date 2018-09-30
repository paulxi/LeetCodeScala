package com.leetcode.algorithm.medium.CopyListWithRandomPointer

import com.leetcode.algorithm.common.RandomListNode
import com.leetcode.algorithm.medium.CopyListWithRandomPointer.Solution._
import org.scalatest._

class CopyListWithRandomPointerSpec extends FlatSpec with Matchers {
  "Clone" should "return work" in {
    val l1: RandomListNode = new RandomListNode(4)
    val l2: RandomListNode = new RandomListNode(7)
    val l3: RandomListNode = new RandomListNode(-2)
    l1.next = l2
    l2.next = l3
    l1.random = l3
    l2.random = l1

    val copyl1 = copyRandomList(l1)
    val copyl2 = copyl1.next
    val copyl3 = copyl2.next

    l1.label shouldEqual copyl1.label
    l2.label shouldEqual copyl2.label
    l3.label shouldEqual copyl3.label
    copyl3 shouldEqual copyl1.random
    copyl1 shouldEqual copyl2.random
  }

}
