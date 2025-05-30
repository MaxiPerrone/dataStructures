package com.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsUniqueTest {

    IsUnique isUnique = new IsUnique();

    @Test
    public void isUniqueTest() {
        assertTrue(isUnique.isUnique("abcde"));
        assertTrue(isUnique.isUnique("aAbBcCdDe"));
        assertFalse(isUnique.isUnique("abcded"));
    }
}
