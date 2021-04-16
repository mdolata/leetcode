import com.mdolata.leetcode.roman_to_integer.Solution
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest3 : BehaviorSpec({
    given("Input of length 3") {
        val instance = Solution()
        val params = mapOf(
            "III" to 3, "VII" to 7,
            "XII" to 12, "XVI" to 16, "XXI" to 21,
            "LII" to 52, "LVI" to 56, "LXI" to 61,
            "CII" to 102, "DCI" to 601,
            "MMI" to 2001, "MCI" to 1101
        )
        for ((k, v) in params) {
            When("run with $k") {
                val result = instance.romanToInt(k)
                then("should be equals to $v") {
                    result shouldBe v
                }
            }
        }
    }
})