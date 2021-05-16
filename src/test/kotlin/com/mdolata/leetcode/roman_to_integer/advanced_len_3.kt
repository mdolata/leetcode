package com.mdolata.leetcode.roman_to_integer

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest5 : BehaviorSpec({
    given("Input of length 3") {
        val instance = Solution()
        val params = mapOf(
            "MCM" to 1900, "MIX" to 1009,
            "CXL" to 140, "CXC" to 190,
            "XIV" to 14, "LIX" to 59
        )
        for ((k, v) in params) {
            When("run with $k") {
                val result = instance.romanToInt(k)
                then("should be equals to $v but is $result") {
                    result shouldBe v
                }
            }
        }
    }
})