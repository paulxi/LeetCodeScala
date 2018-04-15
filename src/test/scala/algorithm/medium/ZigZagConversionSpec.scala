package com.leetcode.algorithm.medium.ZigZagConversion

import com.leetcode.algorithm.medium.ZigZagConversion.Solution._
import org.scalatest._

class ZigZagConversionSpec extends FlatSpec with Matchers {
  "Empty string" should "return ''" in {
    convert("", 3) shouldEqual ""
  }

  "'PAYPALISHIRING'" should "return 'PAHNAPLSIIGYIR'" in {
    convert("PAYPALISHIRING", 3) shouldEqual "PAHNAPLSIIGYIR"
  }
}
