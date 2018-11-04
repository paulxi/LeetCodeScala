package com.leetcode.algorithm.easy.MoveZeroes

import com.leetcode.algorithm.easy.MoveZeroes.Solution._
import org.scalatest._

class MoveZeroesSpec extends FlatSpec with Matchers {
  "[0,1,0,3,12]" should "return [1,3,12,0,0]" in {
    val params = Array(0, 1, 0, 3, 12)
    val expected = Array(1, 3, 12, 0, 0)
    moveZeroes(params)
    params shouldEqual expected
  }
}
