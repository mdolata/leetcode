package com.mdolata.leetcode.roman_to_integer

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest: BehaviorSpec({
    given("Input of length 1") {
        val instance = Solution()
        for ((k, v) in mapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)) {
            When("run with $k") {
                val result = instance.romanToInt(k)
                then("should be equals to $v") {
                    result shouldBe v
                }
            }
        }
    }
})