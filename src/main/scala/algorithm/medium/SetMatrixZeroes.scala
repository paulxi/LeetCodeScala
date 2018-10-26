package com.leetcode.algorithm.medium.SetMatrixZeroes

object Solution {
  object Flag extends Enumeration {
    type Flag = Value
    val None, RowOnly, ColumnOnly, Both = Value
  }

  def setZeroes(matrix: Array[Array[Int]]): Unit = {
    if (matrix.length > 0) {
      val m = matrix.length
      val n = matrix(0).length

      var flag = Flag.None
      if (matrix(0)(0) == 0) {
        flag = Flag.Both
      } else {
        (1 until m).find(idx => {
          matrix(idx)(0) == 0
        }) match {
          case Some(_) => flag = Flag.ColumnOnly
          case None =>
        }

        (1 until n).find(idx => {
          matrix(0)(idx) == 0
        }) match {
          case Some(_) => flag = if (flag == Flag.ColumnOnly) Flag.Both else Flag.RowOnly
          case None =>
        }
      }

      for (i <- 1 until m;
           j <- 1 until n) {
        if (matrix(i)(j) == 0) {
          matrix(i)(0) = 0
          matrix(0)(j) = 0
        }
      }

      for (i <- 1 until m;
           j <- 1 until n) {
        if (matrix(i)(0) == 0 || matrix(0)(j) == 0) {
          matrix(i)(j) = 0
        }
      }

      if (flag == Flag.RowOnly || flag == Flag.Both) {
        for (idx <- 0 until n) {
          matrix(0)(idx) = 0
        }
      }

      if (flag == Flag.ColumnOnly || flag == Flag.Both) {
        for (idx <- 0 until m) {
          matrix(idx)(0) = 0
        }
      }
    }
  }
}
