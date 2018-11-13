package com.leetcode.algorithm.easy.UniqueEmailAddresses

import com.leetcode.algorithm.easy.UniqueEmailAddresses.Solution._
import org.scalatest._

class UniqueEmailAddressesSpec extends FlatSpec with Matchers {
  "Emails" should "return 2" in {
    val emails = Array(
      "test.email+alex@leetcode.com",
      "test.e.mail+bob.cathy@leetcode.com",
      "testemail+david@lee.tcode.com")
    numUniqueEmails(emails) shouldEqual 2
  }

}
