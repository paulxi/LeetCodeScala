package com.leetcode.algorithm.medium.ContainerWithMostWater

import com.leetcode.algorithm.medium.ContainerWithMostWater.Solution._
import org.scalatest._

class ContainerWithMostWaterSpec extends FlatSpec with Matchers {
  "[1,8,6,2,5,4,8,3,7]" should "return 49" in {
    maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)) shouldEqual 49
  }

}
