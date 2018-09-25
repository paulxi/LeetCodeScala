package com.leetcode.algorithm.medium.NumberOfIslands

object Solution {
  def numIslands(grid: Array[Array[Char]]): Int = {
    val rows = grid.length
    if (rows == 0) {
      0
    } else {
      def checkNeighbor(row: Int, col: Int): Unit = {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid(0).length ||
          grid(row)(col) == '0') {} else {
          grid(row)(col) = '0'

          checkNeighbor(row + 1, col)
          checkNeighbor(row - 1, col)
          checkNeighbor(row, col + 1)
          checkNeighbor(row, col - 1)
        }
      }

      var count = 0
      for (row <- grid.indices) {
        for (col <- grid(0).indices) {
          if (grid(row)(col) == '1') {
            count += 1

            checkNeighbor(row, col)
          }
        }
      }

      count
    }
  }
}
