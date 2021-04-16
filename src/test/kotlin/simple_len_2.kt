import com.mdolata.leetcode.roman_to_integer.Solution
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest2 : BehaviorSpec({
    given("Input of length 2") {
        val instance = Solution()
        val params = mapOf(
            "II" to 2, "VI" to 6,
            "XI" to 11, "XV" to 15, "XX" to 20,
            "LI" to 51, "LV" to 55, "LX" to 60,
            "CI" to 101, "DC" to 600,
            "MM" to 2000, "MC" to 1100
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