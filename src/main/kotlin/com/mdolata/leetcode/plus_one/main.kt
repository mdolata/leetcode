package com.mdolata.leetcode.plus_one

class Solution {
    fun plusOne(digits: IntArray) = when (digits.last()) {
        9 -> {
            handleLastDigit9(digits)
        }
        else -> {
            handleOthers(digits)
        }
    }

    private fun handleOthers(digits: IntArray): IntArray {
        digits[digits.lastIndex] = digits.last() + 1
        return digits
    }

    private fun handleLastDigit9(digits: IntArray): IntArray = when (digits.size) {
        1 -> {
            intArrayOf(1, 0)
        }
        else -> {
            copyAndSetLastToZero(plusOne(removeLastElement(digits)), digits)
        }
    }

    private fun copyAndSetLastToZero(newArray: IntArray, oldArray: IntArray): IntArray = when {
        oldArray.all { i -> i == 9 } -> {
            newArray.copyOf(oldArray.size + 1)
        }
        else -> {
            newArray.copyOf(oldArray.size)
        }
    }

    private fun removeLastElement(digits: IntArray) = digits.sliceArray(IntRange(0, digits.lastIndex - 1))
}