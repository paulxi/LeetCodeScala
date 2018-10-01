package com.leetcode.algorithm.medium.LetterCombinationsOfAPhoneNumber

import com.leetcode.algorithm.medium.LetterCombinationsOfAPhoneNumber.Solution._
import org.scalatest._

class LetterCombinationsOfAPhoneNumberSpec extends FlatSpec with Matchers {
  "test case 1" should "work" in {
    letterCombinations("23") shouldEqual ("ad" :: "ae" :: "af" :: "bd" :: "be" :: "bf" :: "cd" :: "ce" :: "cf" :: Nil)
  }
}

