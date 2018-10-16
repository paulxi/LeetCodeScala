package com.leetcode.algorithm.medium.WordLadder

import com.leetcode.algorithm.medium.WordLadder.Solution._
import org.scalatest._

class WordLadderSpec extends FlatSpec with Matchers {
  "'hit', 'cog'" should "return 5" in {
    ladderLength("hit", "cog", List("hot", "dot", "dog", "lot", "log", "cog")) shouldEqual 5
  }

  "'hit', 'cog'" should "return 0" in {
    ladderLength("hit", "cog", List("hot", "dot", "dog", "lot", "log")) shouldEqual 0
  }

  "'hot', 'dog'" should "return 0" in {
    ladderLength("hot", "dog", List("hot", "dog")) shouldEqual 0
  }

}
