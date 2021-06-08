package com.mdolata.leetcode.plus_one

class Solution {
    fun plusOne(digits: IntArray) = when (val lastDigit = digits.last()) {
        9 -> {
            handleLastDigit9(digits)
        }
        else -> {
            handleOthers(digits, lastDigit)
        }
    }

    private fun handleOthers(digits: IntArray, lastDigit: Int): IntArray {
        digits[digits.lastIndex] = lastDigit + 1
        return digits
    }

    private fun handleLastDigit9(digits: IntArray): IntArray = when (digits.size) {
        1 -> {
            intArrayOf(1, 0)
        }
        else -> {
            val tmp = plusOne(removeLastElement(digits))
            val result = createIntArray(digits)
            copyAndSetLastToZero(tmp, result)
        }
    }
}

private fun copyAndSetLastToZero(tmp: IntArray, result: IntArray): IntArray {
    tmp.forEachIndexed { index, digit ->
        result[index] = digit
    }
    result[result.lastIndex] = 0
    return result
}

private fun createIntArray(digits: IntArray): IntArray {
    return if (digits.all { i -> i == 9 }) {
        IntArray(digits.size + 1)
    } else {
        IntArray(digits.size)
    }
}

private fun removeLastElement(digits: IntArray) = digits.sliceArray(IntRange(0, digits.lastIndex - 1))
