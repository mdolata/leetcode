import com.mdolata.leetcode.roman_to_integer.Solution
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest4 : BehaviorSpec({
    given("Input of length 2") {
        val instance = Solution()
        val params = mapOf(
            "IV" to 4, "IX" to 9,
            "XL" to 40, "XC" to 90,
            "CD" to 400, "CM" to 900
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