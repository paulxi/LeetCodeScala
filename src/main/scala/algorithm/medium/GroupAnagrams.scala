package com.leetcode.algorithm.medium.GroupAnagrams

object Solution {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    var map: Map[String, List[String]] = Map()
    for (str <- strs) {
      val key = new String(str.toCharArray.sorted)
      if (map.contains(key)) {
        map += ((key, str :: map(key)))
      } else {
        map += ((key, str :: Nil))
      }
    }

    map.values.toList
  }
}
