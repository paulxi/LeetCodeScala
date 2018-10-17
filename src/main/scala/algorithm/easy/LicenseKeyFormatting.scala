package com.leetcode.algorithm.easy.LicenseKeyFormatting



object Solution {
  def licenseKeyFormatting(str: String, num: Int): String = {
    val newStr = str.toUpperCase.split('-').fold("")(_ + _)

    val result = new StringBuilder()
    for (i <- 0 until newStr.length) {
      if (i % num == 0 && i != 0) {
        result.insert(0, "-")
      }

      val index = newStr.length - 1 - i
      result.insert(0, newStr.charAt(index))
    }

    result.toString
  }
}
