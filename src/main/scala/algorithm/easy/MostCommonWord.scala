package com.leetcode.algorithm.easy.MostCommonWord

object Solution {
  def mostCommonWord(paragraph: String, banned: Array[String]): String = {
    val bannedSet = banned.toSet
    val words = paragraph
      .split(" !?',;.".toCharArray)
      .map(_.toLowerCase)
      .filterNot(str => {
        str.length == 0 || bannedSet.contains(str)
      })

    var map: Map[String, Integer] = Map()
    val maxResult =
      words.foldLeft[(String, Integer)](("", 0))((result, word) => {
        map += (word -> (map.getOrElse[Integer](word, 0) + 1))
        if (map(word) > result._2) {
          (word, map(word))
        } else {
          result
        }
      })

    maxResult._1
  }
}
