package com.mdolata.leetcode.longest_common_prefix

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest : BehaviorSpec({
    val subject = Solution()

    for (case in testCases())
    given("Array of words: ${case.input}") {
        `when`("run the code") {
            val result = subject.longestCommonPrefix(case.input)
            then("should be equal to ${case.output}") {
                result shouldBe case.output
            }
        }
    }

})

fun testCases(): List<TestCase> {
    return listOf(
        TestCase(arrayOf("flower"), "flower"),
        TestCase(arrayOf("flower","flow","flight"), "fl"),
        TestCase(arrayOf("dog","racecar","car"), "")
    )
}

data class TestCase(val input: Array<String>, val output: String)
