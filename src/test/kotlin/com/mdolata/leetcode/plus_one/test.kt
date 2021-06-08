package com.mdolata.leetcode.plus_one

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest : BehaviorSpec({
    val subject = Solution()

    for (case in testCases())
        given("Input: ${case.inputToString()}") {
            `when`("run the code") {
                val result = subject.plusOne(case.input)
                then("should be equal to ${case.outputToString()} and was ${result.toList()}") {
                    result shouldBe case.output
                }
            }
        }

})

fun testCases(): List<TestCase> {
    return listOf(
        TestCase(intArrayOf(1,2,3), intArrayOf(1,2,4)),
        TestCase(intArrayOf(4,3,2,1), intArrayOf(4,3,2,2)),
        TestCase(intArrayOf(0), intArrayOf(1)),
        TestCase(intArrayOf(9), intArrayOf(1,0)),
        TestCase(intArrayOf(1,9), intArrayOf(2,0)),
        TestCase(intArrayOf(9,9), intArrayOf(1,0,0)),
        TestCase(intArrayOf(9,8,9), intArrayOf(9,9,0)),
        TestCase(intArrayOf(8,9,9,9), intArrayOf(9,0,0,0))
    )
}

data class TestCase(val input: IntArray, val output: IntArray) {
    fun inputToString() = input.toList()
    fun outputToString() = output.toList()
}
