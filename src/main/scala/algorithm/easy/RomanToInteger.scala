package com.leetcode.algorithm.easy.RomanToInteger
import scala.annotation.tailrec

object Solution {
  val ROMAN_VALUE_1: Map[String, Int] = Map("I" -> 1,
  "V" -> 5, "X" -> 10, "L" -> 50, "C" -> 100, "D" -> 500, "M" -> 1000)

  val ROMAN_VALUE_2: Map[String, Int] = Map("IV" -> 4,
  "IX" -> 9, "XL" -> 40, "XC" -> 90, "CD" -> 400, "CM" -> 900)

  def romanToInt(s: String): Int = {
    convert(0, s)
  }

  @tailrec
  private def convert(sum: Int, str: String): Int = {
    str.length match {
      case 0 => sum
      case 1 => ROMAN_VALUE_1.getOrElse(str, 0) + sum
      case _ => {
        val firstTwoChars = str.substring(0, 2)
        ROMAN_VALUE_2.get(firstTwoChars) match {
          case Some(x) => convert(sum + x, str.substring(2))
          case _ => convert(sum + ROMAN_VALUE_1.getOrElse(str.substring(0, 1), 0), str.substring(1))
        }
      }
    }
  }
}
