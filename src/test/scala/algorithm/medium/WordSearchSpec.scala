package com.leetcode.algorithm.medium.WordSearch

import org.scalatest._

class WordSearchSpec extends FlatSpec with Matchers {
  "board = ['A','B','C','E'], ['S','F','C','S'], ['A','D','E','E']], Given word = 'ABCCED'" should "return true" in {
    Solution.exist(
      Array(
        Array('A', 'B', 'C', 'E'),
        Array('S', 'F', 'C', 'S'),
        Array('A', 'D', 'E', 'E')
      ),
      "ABCCED"
    ) shouldEqual true
  }

  "board = ['A','B','C','E'], ['S','F','C','S'], ['A','D','E','E']], Given word = 'SEE'" should "return true" in {
    Solution.exist(
      Array(
        Array('A', 'B', 'C', 'E'),
        Array('S', 'F', 'C', 'S'),
        Array('A', 'D', 'E', 'E')
      ),
      "SEE"
    ) shouldEqual true
  }

  "board = ['A','B','C','E'], ['S','F','C','S'], ['A','D','E','E']], Given word = 'ABCB'" should "return false" in {
    Solution.exist(
      Array(
        Array('A', 'B', 'C', 'E'),
        Array('S', 'F', 'C', 'S'),
        Array('A', 'D', 'E', 'E')
      ),
      "ABCB"
    ) shouldEqual false
  }
}
