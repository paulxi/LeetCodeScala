package com.leetcode.algorithm.medium.MeetingRoomsII

import com.leetcode.algorithm.common.Interval

object Solution {
  def minMeetingRooms(intervals: Array[Interval]): Int = {
    if (intervals.length == 0) {
      0
    } else {
      val sortedIntervals = intervals.sortWith((a, b) => {
        a.start < b.start
      })

      val queue = new scala.collection.mutable.PriorityQueue[Int]().reverse
      queue.enqueue(sortedIntervals(0).end)

      for (interval <- sortedIntervals.tail) {
        if (interval.start >= queue.head) {
          queue.dequeue()
        }

        queue.enqueue(interval.end)
      }

      queue.size
    }
  }
}
