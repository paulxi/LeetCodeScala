package com.leetcode.algorithm.medium.LetterCombinationsOfAPhoneNumber

object Solution {
  def letterCombinations(digits: String): List[String] = {
    val LetterValues = Map(
      '2' -> Array("a", "b", "c"),
      '3' -> Array("d", "e", "f"),
      '4' -> Array("g", "h", "i"),
      '5' -> Array("j", "k", "l"),
      '6' -> Array("m", "n", "o"),
      '7' -> Array("p", "q", "r", "s"),
      '8' -> Array("t", "u", "v"),
      '9' -> Array("w", "x", "y", "z")
    )

    if (digits.length == 0) {
      Nil
    } else {
      digits.foldLeft("" :: Nil)((list, char) => {
        list.flatMap((str) => {
          LetterValues(char).map((letter) => {
            str + letter
          })
        })
      })
    }
  }
}
