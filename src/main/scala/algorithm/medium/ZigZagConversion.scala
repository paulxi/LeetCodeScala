package com.leetcode.algorithm.medium.ZigZagConversion

object Solution {
  def convert(s: String, numRows: Int): String = {
    if (numRows == 1) {
      s
    } else {
      val rows: Array[StringBuilder] = Array.fill(numRows)(StringBuilder.newBuilder)

      var index = 0
      var topToDown = true

      for (c <- s) {
        rows(index).append(c)

        if (topToDown) {
          index += 1
        } else {
          index -= 1
        }

        if (index < 0) {
          index = 1
          topToDown = true
        }

        if (index == numRows) {
          index = numRows -2
          topToDown = false
        }
      }

      rows.foldLeft("") {
        (acc, cur) => acc + cur.toString()
      }
    }
  }
}
