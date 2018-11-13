package com.leetcode.algorithm.common

trait NestedInteger {
  def isInteger: Boolean
  def getInteger: Int
  def getList: List[NestedInteger]
}

class NestedIntegerInteger(val intValue: Int) extends NestedInteger {
  override def isInteger: Boolean = true
  override def getInteger: Int = intValue
  override def getList: List[NestedInteger] = null
}

class NestedIntegerList(val values: NestedInteger*) extends NestedInteger {
  val list = values.toList

  override def isInteger: Boolean = false
  override def getInteger: Int = 1 / 0
  override def getList: List[NestedInteger] = list
}