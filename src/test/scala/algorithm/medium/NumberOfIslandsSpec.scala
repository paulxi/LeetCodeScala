package com.leetcode.algorithm.medium.NumberOfIslands

import com.leetcode.algorithm.medium.NumberOfIslands.Solution._
import org.scalatest._

class NumberOfIslandsSpec extends FlatSpec with Matchers {
  "test case 1" should "return 1" in {
    numIslands(
      Array(Array('1', '1', '1', '1', '0'),
            Array('1', '1', '0', '1', '0'),
            Array('1', '1', '0', '0', '0'),
            Array('0', '0', '0', '0', '0'))) shouldEqual 1
  }

  "test case 2" should "return 3" in {
    numIslands(
      Array(Array('1', '1', '0', '0', '0'),
            Array('1', '1', '0', '0', '0'),
            Array('0', '0', '1', '0', '0'),
            Array('0', '0', '0', '1', '1'))) shouldEqual 3
  }

  "test case 3" should "return 1" in {
    numIslands(Array(Array('1', '1', '1'),
                     Array('0', '1', '0'),
                     Array('1', '1', '1'))) shouldEqual 1
  }

}
