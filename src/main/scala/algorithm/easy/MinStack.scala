package com.leetcode.algorithm.easy

class MinStack() {

  /** initialize your data structure here. */
  var min: Long = 0L
  var stack: List[Long] = Nil

  def push(x: Int) {
    stack match {
      case Nil => {
        stack = 0 :: stack
        min = x
      }
      case _ => {
        stack = (x - min) :: stack
        if (x < min) {
          min = x
        }
      }
    }
  }

  def pop() {
    stack match {
      case head :: tail => {
        stack = tail
        if (head < 0) {
          min -= head
        }
      }
      case Nil =>
    }
  }

  def top(): Int = {
    val top = stack.head
    if (top >= 0) {
      (top + min).toInt
    } else {
      (min).toInt
    }
  }

  def getMin(): Int = {
    (min).toInt
  }
}
