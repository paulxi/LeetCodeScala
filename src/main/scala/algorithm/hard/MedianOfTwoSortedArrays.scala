package com.leetcode.algorithm.hard.MedianOfTwoSortedArrays

object Solution {
  def findMedianSortedArrays(arr1: Array[Int], arr2: Array[Int]): Double = {
    var nums1 = arr1
    var nums2 = arr2

    if (nums1.length > nums2.length) {
      var temp = nums1
      nums1 = nums2
      nums2 = temp
    }

    val m = nums1.length
    val n = nums2.length

    var imin = 0
    var imax = m
    val halfLen = (m + n + 1) / 2

    while (imin <= imax) {
      val i = (imin + imax) / 2
      val j = halfLen - i

      if (i < imax && nums2(j - 1) > nums1(i)) {
        imin = i + 1
      } else if (i > imin && nums1(i - 1) > nums2(j)) {
        imax = i - 1
      } else {
        var maxLeft = 0
        if (i == 0) {
          if (j > 0) {
            maxLeft = nums2(j - 1)
          }
        } else if (j == 0) {
          maxLeft = nums1(i - 1)
        } else {
          maxLeft = Math.max(nums1(i - 1), nums2(j - 1))
        }

        var minRight = 0
        if (i == m) {
          if (j < n) {
            minRight = nums2(j)
          }
        } else if (j == n) {
          minRight = nums1(i)
        } else {
          minRight = Math.min(nums1(i), nums2(j))
        }

        if ((m + n) % 2 == 1) {
          return maxLeft
        }

        return (maxLeft + minRight) / 2.0
      }
    }

    0.0
  }
}
