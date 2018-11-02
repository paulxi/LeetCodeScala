package com.leetcode.algorithm.hard.MinimumWindowSubstring

object Solution {
  def minWindow(s: String, t: String): String = {
    if (s.length < t.length || t.length == 0) {
      ""
    } else {
      val map: Map[Char, Int] = t.foldLeft(Map[Char, Int]())((map, char) => {
        val count = map.getOrElse(char, 0) + 1
        map + (char -> count)
      })

      val required = map.size
      var formed = 0
      var windowCounts: Map[Char, Int] = Map()
      var ans = (-1, 0, 0)
      var l = 0
      var r = 0
      while (r < s.length) {
        val char = s.charAt(r)
        val count = windowCounts.getOrElse(char, 0) + 1
        windowCounts = windowCounts + (char -> count)

        map.get(char) match {
          case Some(x) => if (x == count) formed += 1
          case None =>
        }

        while (l <= r && formed == required) {
          if (ans._1 == -1 || ans._1 > r - l + 1) {
            ans = (r - l + 1, l, r)
          }

          var leftChar = s.charAt(l)
          var leftCount = windowCounts.getOrElse(leftChar, 0) - 1
          windowCounts = windowCounts + (leftChar -> leftCount)
          map.get(leftChar) match {
            case Some(x) => if (leftCount < x) formed -= 1
            case None =>
          }

          l += 1
        }

        r += 1
      }

      if (ans._1 == -1) "" else s.substring(ans._2, ans._3 + 1)
    }
  }
}
