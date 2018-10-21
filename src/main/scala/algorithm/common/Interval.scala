package com.leetcode.algorithm.common

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
