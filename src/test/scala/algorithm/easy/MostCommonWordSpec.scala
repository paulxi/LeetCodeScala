package com.leetcode.algorithm.easy.MostCommonWord

import com.leetcode.algorithm.easy.MostCommonWord.Solution._
import org.scalatest._

class MostCommonWordSpec extends FlatSpec with Matchers {
  "'Bob hit a ball, the hit BALL flew far after it was hit.', ['hit']" should "return 'ball'" in {
    mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", Array("hit")) shouldEqual "ball"
  }

  "'Bob. hIt, baLl', ['bob', 'hit']" should "return 'ball'" in {
    mostCommonWord("Bob. hIt, baLl", Array("bob", "hit")) shouldEqual "ball"
  }
}
