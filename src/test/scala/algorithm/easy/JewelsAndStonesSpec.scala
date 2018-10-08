package com.leetcode.algorithm.easy.JewelsAndStones

import com.leetcode.algorithm.easy.JewelsAndStones.Solution._
import org.scalatest._

class JewelsAndStonesSpec extends FlatSpec with Matchers {
  "J = 'aA', S = 'aAAbbbb'" should "return 3" in {
    numJewelsInStones("aA", "aAAbbbb") shouldEqual 3
  }

  "J = 'z', S = 'ZZ'" should "return 0" in {
    numJewelsInStones("z", "ZZ") shouldEqual 0
  }
}
