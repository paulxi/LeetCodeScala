package com.leetcode.algorithm.medium.SetMatrixZeroes

import com.leetcode.algorithm.medium.SetMatrixZeroes.Solution._
import org.scalatest._

class SetMatrixZeroesSpec extends FlatSpec with Matchers {
  "[[1,1,1],[1,0,1],[1,1,1]]" should "return [[1,0,1],[0,0,0],[1,0,1]]" in {
    val params = Array(Array(1, 1, 1), Array(1, 0, 1), Array(1, 1, 1))
    val expected = Array(Array(1, 0, 1), Array(0, 0, 0), Array(1, 0, 1))
    setZeroes(params)
    params shouldEqual expected
  }

  "[[0,1,2,0],[3,4,5,2],[1,3,1,5]]" should "return [[0,0,0,0],[0,4,5,0],[0,3,1,0]]" in {
    val params = Array(Array(0, 1, 2, 0), Array(3, 4, 5, 2), Array(1, 3, 1, 5))
    val expected =
      Array(Array(0, 0, 0, 0), Array(0, 4, 5, 0), Array(0, 3, 1, 0))
    setZeroes(params)
    params shouldEqual expected
  }
}
