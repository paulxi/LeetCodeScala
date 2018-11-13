package com.leetcode.algorithm.hard.MaximalRectangle

import com.leetcode.algorithm.hard.MaximalRectangle.Solution._
import org.scalatest._

class MaximalRectangleSpec extends FlatSpec with Matchers {
  "[['1','0','1','0','0'], ['1','0','1','1','1'], ['1','1','1','1','1'], ['1','0','0','1','0']]" should "return 6" in {
    val input: Array[Array[Char]] = Array(
      Array('1', '0', '1', '0', '0'),
      Array('1', '0', '1', '1', '1'),
      Array('1', '1', '1', '1', '1'),
      Array('1', '0', '0', '1', '0')
    )
    maximalRectangle(input) shouldEqual 6
  }

  "[['0','0','0'], ['0','0','0'], ['0','0','0'], ['0','0','0']]" should "return 0" in {
    val input: Array[Array[Char]] = Array(
      Array('0', '0', '0'),
      Array('0', '0', '0'),
      Array('0', '0', '0'),
      Array('0', '0', '0')
    )
    maximalRectangle(input) shouldEqual 0
  }
}
