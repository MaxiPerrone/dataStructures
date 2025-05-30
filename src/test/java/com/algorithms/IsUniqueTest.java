package com.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsUniqueTest {

    @Test
    public void isUniqueTest() {
        assertTrue(IsUnique.isUnique("abcde"));
        assertTrue(IsUnique.isUnique("aAbBcCdDe"));
        assertFalse(IsUnique.isUnique("abcded"));
    }
}
