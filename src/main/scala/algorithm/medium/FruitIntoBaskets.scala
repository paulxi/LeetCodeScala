package com.leetcode.algorithm.medium.FruitIntoBaskets

object Solution {
  def totalFruit(tree: Array[Int]): Int = {
    var ans = 0;
    var ptr = 0;
    var count: Map[Int, Int] = Map()

    for ((treeType, i) <- tree.zipWithIndex) {
      count += (treeType -> (count.getOrElse(treeType, 0) + 1))

      while (count.size > 2) {
        count += (tree(ptr) -> (count(tree(ptr)) - 1))
        if (count(tree(ptr)) == 0) {
          count -= tree(ptr)
        }
        ptr += 1
      }

      ans = Math.max(ans, i - ptr + 1)
    }

    ans
  }
}
