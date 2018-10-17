package com.leetcode.algorithm.easy.LicenseKeyFormatting

import com.leetcode.algorithm.easy.LicenseKeyFormatting.Solution._
import org.scalatest._

class LicenseKeyFormattingSpec extends FlatSpec with Matchers {
  "S = '5F3Z-2e-9-w', K = 4" should "return '5F3Z-2E9W'" in {
    licenseKeyFormatting("5F3Z-2e-9-w", 4) shouldEqual "5F3Z-2E9W"
  }

  "S = '2-5g-3-J', K = 2" should "return '2-5G-3J'" in {
    licenseKeyFormatting("2-5g-3-J", 2) shouldEqual "2-5G-3J"
  }

  "S = '-5g-3-J', K = 2" should "return '-5G-3J'" in {
    licenseKeyFormatting("-5g-3-J", 2) shouldEqual "5G-3J"
  }
}
