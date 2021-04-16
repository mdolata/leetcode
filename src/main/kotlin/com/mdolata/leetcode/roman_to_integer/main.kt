package com.mdolata.leetcode.roman_to_integer


class Solution {
    private val symbols = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)

    fun romanToInt(s: String): Int = when (s.length) {
        0 -> 0
        1 -> symbols.getValue(s.first())
        else -> method(s)
    }

    private fun method(s: String) = process(checkSubtraction(s.substring(0, 2)), s)

    private fun process(tmpResult: Int, s: String) = when {
        tmpResult > 0 -> tmpResult + romanToInt(s.substring(2))
        else -> symbols.getValue(s.first()) + romanToInt(s.substring(1))
    }


    private fun checkSubtraction(substring: String) = when (substring) {
        "IV" -> 4
        "IX" -> 9
        "XL" -> 40
        "XC" -> 90
        "CD" -> 400
        "CM" -> 900
        else -> 0
    }
}