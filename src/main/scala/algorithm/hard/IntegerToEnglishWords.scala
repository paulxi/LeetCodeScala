package com.leetcode.algorithm.hard.IntegerToEnglishWords

object Solution {
  val valueMap: Map[Int, String] = Map(1000000000 -> "Billion",
    1000000 -> "Million",
    1000 -> "Thousand",
    100 -> "Hundred",
    90 -> "Ninety",
    80 -> "Eighty",
    70 -> "Seventy",
    60 -> "Sixty",
    50 -> "Fifty",
    40 -> "Forty",
    30 -> "Thirty",
    20 -> "Twenty",
    19 -> "Nineteen",
    18 -> "Eighteen",
    17 -> "Seventeen",
    16 -> "Sixteen",
    15 -> "Fifteen",
    14 -> "Fourteen",
    13 -> "Thirteen",
    12 -> "Twelve",
    11 -> "Eleven",
    10 -> "Ten",
    9 -> "Nine",
    8 -> "Eight",
    7 -> "Seven",
    6 -> "Six",
    5 -> "Five",
    4 -> "Four",
    3 -> "Three",
    2 -> "Two",
    1 -> "One",
    0 -> "Zero")

  def numberToWords(num: Int): String = {
    if (num == 0) {
      valueMap(num)
    } else {
      convertToWord(num)
    }
  }

  def convertToWord(num: Int): String = {
    var result = ""
    if (num > 0) {
      var remainder = 0
      var div = num / 1000000000
      if (div > 0) {
        remainder = num % 1000000000
        result = convertToWord(div) + " " + valueMap(1000000000)
      } else {
        div = num / 1000000
        if (div > 0) {
          remainder = num % 1000000
          result = convertToWord(div) + " " + valueMap(1000000)
        } else {
          div = num / 1000
          if (div > 0) {
            remainder = num % 1000
            result = convertToWord(div) + " " + valueMap(1000)
          } else {
            div = num / 100
            if (div > 0) {
              remainder = num % 100
              result = convertToWord(div) + " " + valueMap(100)
            } else {
              if (num >= 20) {
                remainder = num % 10
                result = valueMap(num - remainder)
              } else {
                remainder = 0
                result = valueMap(num)
              }
            }
          }
        }
      }

      if (remainder > 0) {
        if (div > 0 || num < 100) {
          result += " "
        }

        result += convertToWord(remainder)
      }
    }

    result
  }
}
