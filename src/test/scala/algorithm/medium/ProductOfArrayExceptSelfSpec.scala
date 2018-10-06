package com.leetcode.algorithm.medium.ProductOfArrayExceptSelf

import com.leetcode.algorithm.medium.ProductOfArrayExceptSelf.Solution._
import org.scalatest._

class ProductOfArrayExceptSelfSpec extends FlatSpec with Matchers {
  "[1,2,3,4]" should "return [24,12,8,6]" in {
    productExceptSelf(Array(1, 2, 3, 4)) shouldEqual Array(24, 12, 8, 6)
  }

}
