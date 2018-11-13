package com.leetcode.algorithm.medium.FlattenNestedListIterator

import com.leetcode.algorithm.common.{NestedInteger, NestedIntegerInteger, NestedIntegerList}
import org.scalatest._

class FlattenNestedListIteratorSpec extends FlatSpec with Matchers {
  "[[1,1],2,[1,1]]" should "return [1,1,2,1,1]" in {
    val input = new NestedIntegerList(new NestedIntegerInteger(1), new NestedIntegerInteger(1)) ::
                new NestedIntegerInteger(2) ::
                new NestedIntegerList(new NestedIntegerInteger(1), new NestedIntegerInteger(1)) ::
                Nil
    val iterator = new NestedIterator(nestedList = input)
    var output: List[Int] = Nil

    while (iterator.hasNext) {
      output = iterator.next :: output
    }

    output = output.reverse

    output shouldEqual 1 :: 1 :: 2 :: 1 :: 1 :: Nil
  }

  "[1,[4,[6]]]" should "return [1,4,6]" in {
    val input = new NestedIntegerInteger(1) ::
      new NestedIntegerList(new NestedIntegerInteger(4), new NestedIntegerList(new  NestedIntegerInteger(6))) ::
      Nil
    val iterator = new NestedIterator(nestedList = input)
    var output: List[Int] = Nil

    while (iterator.hasNext) {
      output = iterator.next :: output
    }

    output = output.reverse

    output shouldEqual 1 :: 4 :: 6 :: Nil
  }

}
