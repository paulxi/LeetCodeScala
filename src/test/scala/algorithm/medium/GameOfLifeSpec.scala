package com.leetcode.algorithm.medium.GameOfLife

import com.leetcode.algorithm.medium.GameOfLife.Solution._
import org.scalatest._

class GameOfLifeSpec extends FlatSpec with Matchers {
  "[[0, 1, 0], [0, 0, 1], [1, 1, 1], [0, 0, 0]]" should "return [[0, 0, 0], [1, 0, 1], [0, 1, 1], [0, 1, 0]]" in {
    val params = Array(Array(0, 1, 0), Array(0, 0, 1), Array(1, 1, 1), Array(0, 0, 0))
    val expected = Array(Array(0, 0, 0), Array(1, 0, 1), Array(0, 1, 1), Array(0, 1, 0))
    gameOfLife(params)
    params(0) shouldEqual expected(0)
    params(1) shouldEqual expected(1)
    params(2) shouldEqual expected(2)
    params(3) shouldEqual expected(3)
  }

}
