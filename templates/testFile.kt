package com.mdolata.leetcode.TASK_NAME

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest : BehaviorSpec({
    val subject = Solution()

    for (case in testCases())
        given("Input: ${case.input}") {
            `when`("run the code") {
                val result = subject.CHANGE_ME(case.input)
                then("should be equal to ${case.output}") {
                    result shouldBe case.output
                }
            }
        }

})

fun testCases(): List<TestCase> {
    return listOf(

    )
}

data class TestCase(val input: T, val output: T)
