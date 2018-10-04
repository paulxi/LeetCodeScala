package com.leetcode.algorithm.easy.BestTimeToBuyAndSellStock

object Solution {
  def maxProfit(prices: Array[Int]): Int = {
    if (prices.length > 0) {
      prices.zip(prices.tail).foldLeft((0, 0))((result, value) => {
        var (max, temp) = result
        temp += value._2 - value._1

        if (temp > max) {
          max = temp
        }
        if (temp < 0) {
          temp = 0
        }

        (max, temp)
      })._1
    } else {
      0
    }
  }
}
