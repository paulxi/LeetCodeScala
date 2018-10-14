package com.leetcode.algorithm.easy.MergeSortedArray

object Solution {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    def mergeOneElement(nums1: Array[Int], i: Int, nums2: Array[Int], j: Int, k: Int) : Unit = {
      if (j >= 0) {
        if (i < 0 || nums2(j) > nums1(i)) {
          nums1(k) = nums2(j)
          mergeOneElement(nums1, i, nums2, j - 1, k - 1)
        } else {
          nums1(k) = nums1(i)
          mergeOneElement(nums1, i - 1, nums2, j, k - 1)
        }
      }
    }

    mergeOneElement(nums1, m - 1, nums2, n - 1, m + n - 1)
  }
}
