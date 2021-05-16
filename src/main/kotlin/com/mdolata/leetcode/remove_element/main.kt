package com.mdolata.leetcode.remove_element

class Solution {
    fun removeElement(nums: IntArray, value: Int): Int {
        val newValues = nums.filter { it != value }

        for (i in nums.indices)
            if (i < newValues.size)
                nums[i] = newValues[i]
            else
                nums[i] = 0

        return newValues.size
    }

}