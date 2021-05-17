package com.mdolata.leetcode.search_insert_position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.lastIndex)
    }

    private fun binarySearch(nums: IntArray, target: Int, lower: Int, higher: Int): Int {
        when {
            lower == higher -> {
                return when (target) {
                    nums[lower] -> lower
                    else -> {
                        if (nums[lower] > target) lower
                        else lower + 1
                    }
                }
            }
            higher - lower == 1 -> {
                return when (target) {
                    nums[lower] -> lower
                    nums[higher] -> higher
                    else -> {
                        if (nums[lower] > target) lower
                        else if (nums[lower] < target && nums[higher] > target) higher
                        else higher+1
                    }
                }
            }
            else -> {
                val middle = (lower + higher) / 2
                return when {
                    nums[middle] < target -> binarySearch(nums, target, middle, higher)
                    else -> binarySearch(nums, target, lower, middle)
                }
            }
        }
    }
}
