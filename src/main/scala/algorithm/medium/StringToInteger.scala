package com.leetcode.algorithm.medium.StringToInteger

object Solution {
  def myAtoi(str: String): Int = {
    val posRemainder = Int.MaxValue % 10
    val negRemainder = Int.MinValue % 10

    var rest = str.dropWhile(x => x == ' ')
    var negative = false

    if (rest.length > 0) {
      if (rest.substring(0, 1) == "-") {
        negative = true;
        rest = rest.substring(1)
      } else if (rest.substring(0, 1) == "+") {
        rest = rest.substring(1)
      }
    }

    rest
      .takeWhile(x => x >= '0' && x <= '9')
      .foldLeft(0) { (acc, char) => {
        val sub = if (negative) { '0' - char } else { char - '0' }
        if (acc < Int.MinValue / 10 || (acc == Int.MinValue / 10 && sub < negRemainder)) {
          Int.MinValue
        } else if (acc > Int.MaxValue / 10 || (acc == Int.MaxValue / 10 && sub > posRemainder)) {
          Int.MaxValue
        } else {
          acc * 10 + sub
        }
      }
      }
  }
}
