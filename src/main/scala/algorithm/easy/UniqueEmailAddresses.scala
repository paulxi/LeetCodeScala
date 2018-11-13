package com.leetcode.algorithm.easy.UniqueEmailAddresses

object Solution {
  def numUniqueEmails(emails: Array[String]): Int = {
    var set: Set[String] = Set()
    for (email <- emails) {
      val atIndex = email.indexOf("@")
      var localName = email.substring(0, atIndex)
      val domainName = email.substring(atIndex + 1)

      val plusIndex = localName.indexOf("+")
      localName = localName.substring(0, plusIndex)
      localName = localName.replace(".", "")
      set += localName + "@" + domainName
    }

    set.size
  }
}
