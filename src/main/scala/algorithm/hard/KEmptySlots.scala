package com.leetcode.algorithm.hard.KEmptySlots
import scala.annotation.tailrec

object Solution {
  def kEmptySlots(flowers: Array[Int], k: Int): Int = {
    val days = flowers.zipWithIndex.foldLeft(new Array[Int](flowers.length))((arr, flower) => {
      arr(flower._1 - 1) = flower._2 + 1
      arr
    })

    find(days, 0, k + 1, k, Int.MaxValue)
  }

  @tailrec
  def find(days: Array[Int], left: Int, right: Int, k: Int, ans: Int): Int = {
    if (right < days.length) {
      val index = days.slice(left + 1, right).indexWhere(day => day < days(left) || day < days(right))
      if (index == -1) {
        val min = Math.min(ans, Math.max(days(left), days(right)))
        find(days, right, right + k + 1, k, min)
      } else {
        find(days, left + 1 + index, left + 1 + index + k + 1, k, ans)
      }
    } else {
      if (ans == Int.MaxValue) -1 else ans
    }
  }
}
