package com.leetcode.algorithm.medium.MergeIntervals

class Interval(var _start: Int = 0, var _end: Int = 0) {
  var start: Int = _start
  var end: Int = _end


  def canEqual(other: Any): Boolean = other.isInstanceOf[Interval]

  override def equals(other: Any): Boolean = other match {
    case that: Interval =>
      (that canEqual this) &&
        start == that.start &&
        end == that.end
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(start, end)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

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
