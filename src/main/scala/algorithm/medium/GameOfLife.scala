package com.leetcode.algorithm.medium.GameOfLife

object Solution {
  def gameOfLife(board: Array[Array[Int]]): Unit = {
    if (board.length > 0) {
      val m = board.length
      val n = board(0).length

      for (i <- 0 until m;
           j <- 0 until n) {
        val lives = livesOfNeighbor(board, m, n, i, j)
        if (board(i)(j) == 1 && lives >= 2 && lives <= 3) {
          board(i)(j) = 3
        }
        if (board(i)(j) == 0 && lives == 3) {
          board(i)(j) = 2
        }
      }

      for (i <- 0 until m;
           j <- 0 until n) {
        board(i)(j) >>= 1
      }
    }
  }

  private def livesOfNeighbor(board: Array[Array[Int]], m: Int, n: Int, i: Int, j: Int): Int = {
    var lives = 0
    for (x <- Math.max(i - 1, 0) to Math.min(i + 1, m - 1);
         y <- Math.max(j - 1, 0) to Math.min(j + 1, n - 1)) {
      lives += board(x)(y) & 1
    }

    lives -= board(i)(j) & 1

    lives
  }
}
