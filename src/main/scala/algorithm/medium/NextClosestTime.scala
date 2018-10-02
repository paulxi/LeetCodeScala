package com.leetcode.algorithm.medium.NextClosestTime

object Solution {
  def nextClosestTime(time: String): String = {
    var digits = Array(
      time.charAt(0) - '0',
      time.charAt(1) - '0',
      time.charAt(3) - '0',
      time.charAt(4) - '0'
    )
    val timeValue = convertToNumber(digits)
    digits = digits.sorted

    var firstDigits: Option[Array[Int]] = None
    for (i <- digits;
         j <- digits if i * 10 + j <= 23;
         k <- digits;
         l <- digits if k * 10 + l <= 59) {
      if (convertToNumber(Array(i, j, k, l)) > timeValue) {
        return s"$i$j:$k$l"
      }

      if (firstDigits.isEmpty) {
        firstDigits = Some(Array(i, j, k, l))
      }
    }

    val result = firstDigits.get
    s"${result(0)}${result(1)}:${result(2)}${result(3)}"
  }

  def convertToNumber(digits: Array[Int]): Int = {
    (digits(0) * 10 + digits(1)) * 60 + (digits(2) * 10 + digits(3))
  }
}
