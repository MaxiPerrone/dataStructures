package com.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void twoSumTest() {
        int[] nums = {9, 2, 5, 6};
        int target = 7;
        int[] result = twoSum.execute(nums, target);
        assertTrue((result[0] == 1 && result[1] == 2) || result[0] == 2 && result[1] == 1);
        assertEquals(null, twoSum.execute(nums, 50));
    }
}
