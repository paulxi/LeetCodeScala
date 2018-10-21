package com.leetcode.algorithm.medium.MergeIntervals

import com.leetcode.algorithm.common.Interval

object Solution {
  def merge(intervals: List[Interval]): List[Interval] = {
    val sortedIntervals = intervals.sortWith {
      (lhs, rhs) => lhs.start < rhs.start
    }

    sortedIntervals.foldLeft[List[Interval]](Nil) {
      (result, interval) => {
        result match {
          case Nil => interval :: Nil
          case _ => if (result.last.end >= interval.start) {
            result.last.end = Math.max(result.last.end, interval.end)
            result
          } else {
            result :+ interval
          }
        }
      }
    }
  }
}
