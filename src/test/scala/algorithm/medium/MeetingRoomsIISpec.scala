package com.leetcode.algorithm.medium.MeetingRoomsII

import com.leetcode.algorithm.common.Interval
import com.leetcode.algorithm.medium.MeetingRoomsII.Solution._
import org.scalatest._

class MeetingRoomsIISpec extends FlatSpec with Matchers {
  "[[0, 30],[5, 10],[15, 20]]" should "return 2" in {
    minMeetingRooms(Array(new Interval(0, 30),
                          new Interval(5, 10),
                          new Interval(15, 20))) shouldEqual 2
  }

  "[[7,10],[2,4]]" should "return 1" in {
    minMeetingRooms(Array(new Interval(7, 10),
      new Interval(2, 4))) shouldEqual 1
  }
}
