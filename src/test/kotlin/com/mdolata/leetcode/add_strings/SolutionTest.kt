package com.mdolata.leetcode.add_strings

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.spec.style.scopes.GivenScope
import io.kotest.matchers.shouldBe


internal class SolutionTest : BehaviorSpec({
//    val instance = Solution()
//    given("Two simple numbers") {
//        val inputs = listOf(Pair(2, 2), Pair(10, 5), Pair(3, 5), Pair(22, 5),Pair(0, 5))
//        testCase(inputs, instance)
//    }
//    given("Two small numbers with overload") {
//        val inputs = listOf(Pair(19, 2), Pair(1, 9), Pair(10, 10), Pair(18, 9), Pair(95, 5))
//        testCase(inputs, instance)
//    }
})

private suspend fun GivenScope.testCase(
    inputs: List<Pair<Int, Int>>,
    instance: Solution
) {
    for (input in inputs) {
        When("call the instance with input $input") {
            val result1 = instance.addStrings(input.first.toString(), input.second.toString())
            And("call the instance with different input order") {
                val result2 = instance.addStrings(input.second.toString(), input.first.toString())

                Then("should results be equals and fine") {
                    result1 shouldBe result2
                    result1 shouldBe (input.first + input.second).toString()
                }
            }
        }
    }
}