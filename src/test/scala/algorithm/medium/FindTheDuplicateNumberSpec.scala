package com.leetcode.algorithm.medium.FindTheDuplicateNumber

import com.leetcode.algorithm.medium.FindTheDuplicateNumber.Solution._
import org.scalatest._

class FindTheDuplicateNumberSpec extends FlatSpec with Matchers {
  "[1,3,4,2,2]" should "return 2" in {
    findDuplicate(Array(1, 3, 4, 2, 2)) shouldEqual 2
  }

  "[3,1,3,4,2]" should "return 3" in {
    findDuplicate(Array(3, 1, 3, 4, 2)) shouldEqual 3
  }
}
