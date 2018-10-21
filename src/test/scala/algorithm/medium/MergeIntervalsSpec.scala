package com.leetcode.algorithm.medium.MergeIntervals

import com.leetcode.algorithm.common.Interval
import com.leetcode.algorithm.medium.MergeIntervals.Solution._
import org.scalatest._

class MergeIntervalsSpec extends FlatSpec with Matchers {
  "test case 1" should "work" in {
    merge(new Interval(1, 3) :: new Interval(2, 6)
      :: new Interval(8, 10) :: new Interval(15, 18)
      :: Nil) shouldEqual  (new Interval(1, 6) :: new Interval(8, 10)
    :: new Interval(15, 18) :: Nil)
  }

  "test case 2" should "work" in {
    merge(new Interval(1, 4) :: new Interval(4, 5)
      :: Nil) shouldEqual  new Interval(1, 5) :: Nil
  }

  "test case 3" should "work" in {
    merge(new Interval(1, 4) :: new Interval(2, 3)
      :: Nil) shouldEqual  new Interval(1, 4) :: Nil
  }

}

