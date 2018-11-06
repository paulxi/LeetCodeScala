package com.leetcode.algorithm.medium.WordSearch

object Solution {
  def exist(board: Array[Array[Char]], word: String): Boolean = {
    if (board.length == 0) {
      false
    } else {
      val rows = board.length
      val columns = board(0).length
      val visited = Array.ofDim[Boolean](rows, columns)

      for (i <- 0 until rows) {
        for (j <- 0 until columns) {
          if (search(board, word, i, j, 0, visited)) {
            return true
          }
        }
      }

      false
    }
  }

  private def search(board: Array[Array[Char]], word: String, row: Int, column: Int, index: Int, visited: Array[Array[Boolean]]): Boolean = {
    if (index == word.length) {
      true
    } else {
      val rows = board.length
      val columns = board(0).length

      if (row < 0 || row == rows || column < 0 || column == columns || board(row)(column) != word.charAt(index) || visited(row)(column)) {
        false
      } else {
        visited(row)(column) = true
        if (search(board, word, row - 1, column, index + 1, visited) ||
          search(board, word, row + 1, column, index + 1, visited) ||
          search(board, word, row, column - 1, index + 1, visited) ||
          search(board, word, row, column + 1, index + 1, visited)) {
          true
        } else {
          visited(row)(column) = false
          false
        }
      }
    }
  }
}
