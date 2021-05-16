package com.mdolata.leetcode.longest_common_prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) return strs.first()

        var currentResult = ""
        for (i in 0 until minimumSize(strs)) {

            val quantityOfSymbolsOnPositionI = strs.map { it[i] }.toSet().size
            if (quantityOfSymbolsOnPositionI == 1) {
                currentResult += strs.first()[i]
            } else {
                break
            }
        }

        return currentResult
    }

    private fun minimumSize(strs: Array<String>): Int {
        return strs.minBy { it.length }!!.length
    }
}