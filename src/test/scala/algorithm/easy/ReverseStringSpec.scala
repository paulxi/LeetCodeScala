package com.leetcode.algorithm.easy.ReverseString

import com.leetcode.algorithm.easy.ReverseString.Solution._
import org.scalatest._

class ReverseStringSpec extends FlatSpec with Matchers {
  "'hello'" should "return 'olleh'" in {
    reverseString("hello") shouldEqual "olleh"
  }

  "'A man, a plan, a canal: Panama'" should "return 'amanaP :lanac a ,nalp a ,nam A'" in {
    reverseString("A man, a plan, a canal: Panama") shouldEqual "amanaP :lanac a ,nalp a ,nam A"
  }

}
