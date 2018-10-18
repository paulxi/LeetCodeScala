package com.leetcode.algorithm.medium.PowXn

import com.leetcode.algorithm.medium.PowXn.Solution._
import org.scalatest._

class PowXnSpec extends FlatSpec with Matchers {
  "2.00000, 10" should "return 1024.00000" in {
    myPow(2.0, 10) shouldEqual 1024.0
  }

  "2.10000, 3" should "return 9.2610000" in {
    myPow(2.1, 3) should === (9.261 +- 0.01)
  }

  "2.00000, -2" should "return 0.25" in {
    myPow(2.0, -2) shouldEqual  0.25
  }

  "2.00000, -2147483648" should "return 0.0" in {
    myPow(2.0, -2147483648) should === (0.0 +- 0.01)
  }

}
