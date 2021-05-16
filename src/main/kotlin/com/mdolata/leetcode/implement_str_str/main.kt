package com.mdolata.leetcode.implement_str_str

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        return this.strStr(haystack, needle, 0)
    }

    private fun strStr(haystack: String, needle: String, counter: Int): Int = when {
        needle.isEmpty() -> 0
        haystack.isEmpty() -> -1
        haystack.startsWith(needle) -> counter
        else -> strStr(haystack.substring(1), needle, counter + 1)
    }
}