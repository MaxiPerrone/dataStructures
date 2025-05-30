package com.algorithms;

import java.util.HashMap;
import java.util.Map;

/*
 * Dado un array de numeros enteros y un target, retorna los indices de 2
 * numeros para los que la suma de ambos sea igual al target.
 * 
 * Example 1:
 * Input: nums = [9,2,5,6], target = 7
 * Output: [1,2]
 * 
 * Example 2:
 * Input: nums = [9,2,5,6], target = 100
 * Output: null
 * 
 * The best opcion is Big O = O(N)
 */

public class TwoSum {

    public int[] execute(int[] nums, int target) {
        if (nums == null || nums.length < 2) return null;

        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) return new int[] { i, numbers.get(nums[i]) };

            int complement = target - nums[i];
            numbers.put(complement, i);
        }

        return null;
    }
}
