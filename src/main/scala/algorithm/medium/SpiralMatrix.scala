package com.leetcode.algorithm.medium.SpiralMatrix

object Solution {
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    var result: List[Int] = Nil
    if (matrix.length > 0) {
      result = fill(matrix, 0, matrix.length - 1, 0, matrix(0).length - 1, result)
      result = result.reverse
    }

    result
  }

  def fill(matrix: Array[Array[Int]], rowBegin: Int, rowEnd: Int, colBegin: Int,
           colEnd: Int, result: List[Int]): List[Int] = {
    if (rowBegin <= rowEnd && colBegin <= colEnd) {
      var newResult = result

      for (col <- colBegin to colEnd) {
        newResult = matrix(rowBegin)(col) :: newResult
      }

      for (row <- rowBegin + 1 to rowEnd) {
        newResult = matrix(row)(colEnd) :: newResult
      }

      if (rowBegin < rowEnd && colBegin < colEnd) {
        for (col <- colEnd - 1 to colBegin by -1) {
          newResult = matrix(rowEnd)(col) :: newResult
        }

        for (row <- rowEnd - 1 to rowBegin + 1 by -1) {
          newResult = matrix(row)(colBegin) :: newResult
        }
      }

      fill(matrix, rowBegin + 1, rowEnd - 1, colBegin + 1, colEnd - 1, newResult)
    } else {
      result
    }
  }
}
