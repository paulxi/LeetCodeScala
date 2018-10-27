package com.leetcode.algorithm.medium.FruitIntoBaskets

import com.leetcode.algorithm.medium.FruitIntoBaskets.Solution._
import org.scalatest._

class FruitIntoBasketsSpec extends FlatSpec with Matchers {
  "[1,2,1]" should "return 3" in {
    totalFruit(Array(1, 2, 1)) shouldEqual 3
  }

  "[0,1,2,2]" should "return 3" in {
    totalFruit(Array(0, 1, 2, 2)) shouldEqual 3
  }

  "[1,2,3,2,2]" should "return 3" in {
    totalFruit(Array(1, 2, 3, 2, 2)) shouldEqual 4
  }

  "[3,3,3,1,2,1,1,2,3,3,4]" should "return 3" in {
    totalFruit(Array(3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4)) shouldEqual 5
  }

}
