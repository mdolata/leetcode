package com.mdolata.leetcode.plus_one


fun main() {
    Solution().plusOne(intArrayOf(8, 9, 9, 9))
}

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        if (digits.isEmpty()) {
            return intArrayOf()
        }

        val lastDigit = digits.last()
        val result = if (lastDigit == 9) {
            if (digits.size == 1) {
                return intArrayOf(1, 0)
            }

            val tmp = plusOne(digits.sliceArray(IntRange(0, digits.lastIndex - 1)))
            val tmpres = if (digits.all { i -> i == 9 }) {
                IntArray(digits.size + 1)
            } else {
                IntArray(digits.size)
            }
            tmp.forEachIndexed { index, digit ->
                tmpres[index] = digit
            }
            tmpres[tmpres.lastIndex] = 0
            tmpres
        } else {
            digits[digits.lastIndex] = lastDigit + 1
            digits
        }


        return result
    }
}