package com.leetcode.algorithm.easy.AddBinary

object Solution {
  def addBinary(a: String, b: String): String = {
    val result = new StringBuilder()
    var carrier = '0'
    var index = 0

    while (index < a.length || index < b.length) {
      var achar = '0'
      var bchar = '0'

      if (index < a.length) {
        achar = a.charAt(a.length - index - 1)
      }

      if (index < b.length) {
        bchar = b.charAt(b.length - index - 1)
      }

      if (achar == bchar) {
        result.insert(0, carrier)
        carrier = achar
      } else {
        if (carrier == '0') {
          result.insert(0, '1')
        } else {
          result.insert(0, '0')
        }
      }

      index += 1
    }

    if (carrier == '1') {
      result.insert(0, carrier)
    }

    result.toString()
  }
}
