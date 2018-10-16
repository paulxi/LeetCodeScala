package com.leetcode.algorithm.medium.WordLadder

object Solution {
  def ladderLength(beginWord: String, endWord: String, wordList: List[String]): Int = {
    var remained = wordList.toSet
    var reached = Set[String]()
    reached += beginWord

    var distance = 1
    while (!remained.isEmpty && !reached.isEmpty) {
      if (reached.contains(endWord)) {
        return distance
      }

      remained --= reached

      distance += 1

      var children = Set[String]()
      for (word <- reached;
           str <- remained if (!children.contains(str) && isOneLetterDiff(word, str))) {
        children += str
      }

      reached = children
    }

    0
  }

  private def isOneLetterDiff(src: String, dist: String) : Boolean = {
    for (i <- 0 until src.length) {
      if (src.charAt(i) != dist.charAt(i)) {
        return src.substring(i + 1) == dist.substring(i + 1)
      }
    }

    false
  }
}

