package com.leetcode.algorithm.medium.GroupAnagrams

import com.leetcode.algorithm.medium.GroupAnagrams.Solution._
import org.scalatest._

class GroupAnagramsSpec extends FlatSpec with Matchers {
  "['eat', 'tea', 'tan', 'ate', 'nat', 'bat']" should "return ['ate','eat','tea'], ['nat','tan'], ['bat']]" in {
    groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat")) shouldEqual List(
      List("ate","tea","eat"),
      List("nat","tan"),
      List("bat"))
  }
}
