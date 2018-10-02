package com.leetcode.algorithm.medium.NextClosestTime

import com.leetcode.algorithm.medium.NextClosestTime.Solution._
import org.scalatest._

class NextClosestTimeSpec extends FlatSpec with Matchers {
  "19:34" should "19:39" in {
    nextClosestTime("19:34") shouldEqual ("19:39")
  }

  "23:59" should "22:22" in {
    nextClosestTime("23:59") shouldEqual ("22:22")
  }

  "01:32" should "01:33" in {
    nextClosestTime("01:32") shouldEqual ("01:33")
  }
}