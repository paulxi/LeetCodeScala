package com.leetcode.algorithm.easy.AddBinary

import com.leetcode.algorithm.easy.AddBinary.Solution._
import org.scalatest._

class AddBinarySpec extends FlatSpec with Matchers {
  "a = '11', b = '1'" should "return '100'" in {
    addBinary("11", "1") shouldEqual "100"
  }

  "a = '1010', b = '1011'" should "return '10101'" in {
    addBinary("1010", "1011") shouldEqual "10101"
  }

}
