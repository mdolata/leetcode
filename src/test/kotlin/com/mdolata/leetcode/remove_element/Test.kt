package com.mdolata.leetcode.remove_element

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest : BehaviorSpec({
    val subject = Solution()

    for (case in testCases()) {
        given(case.inputToString()) {
            `when`("run on the instance") {
                val result = subject.removeElement(case.input.first, case.input.second)
                then("should return ${case.outputToString()} but was ${case.input.first.toList()}, $result") {
                    result shouldBe case.output.second
                    case.input.first shouldBe case.output.first
                }
            }
        }
    }
})

data class TestCase(val input: Pair<IntArray, Int>, val output: Pair<IntArray, Int>) {
    fun inputToString() = "(${input.first.toList()}, ${input.second}"
    fun outputToString() = "(${output.first.toList()}, ${output.second}"
}

fun testCases(): List<TestCase> {
    return listOf(
        TestCase(Pair(intArrayOf(1, 2, 3), 4), Pair(intArrayOf(1, 2, 3), 3)),
        TestCase(Pair(intArrayOf(3, 2, 2, 3), 3), Pair(intArrayOf(2, 2, 0, 0), 2)),
        TestCase(Pair(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2), Pair(intArrayOf(0, 1, 3, 0, 4, 0, 0, 0), 5))
    )
}
