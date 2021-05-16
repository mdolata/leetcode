package com.mdolata.leetcode.implement_str_str

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest : BehaviorSpec({
    val subject = Solution()

    for (case in testCases())
        given("Input: ${case.input}") {
            `when`("run the code") {
                val result = subject.strStr(case.input.first, case.input.second)
                then("should be equal to ${case.output}") {
                    result shouldBe case.output
                }
            }
        }

})

fun testCases(): List<TestCase> {
    return listOf(
        TestCase(Pair("Any", ""), 0),
        TestCase(Pair("hello", "ll"), 2),
        TestCase(Pair("aaaaa", "bba"), -1)
    )
}

data class TestCase(val input: Pair<String, String>, val output: Int)
