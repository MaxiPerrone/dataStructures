package com.algorithms;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a method that receives a String, check if all characters are unique or not
 * isUnique("abcde") = true;
 * isUnique("abcdee") = false;
 * 
 * The best opcion is Big O = O(1)
 */

public class IsUnique {
    private static int NUMBER_OF_CHARS = 128;

    public static boolean isUnique(String s) {
        if (s.length() > NUMBER_OF_CHARS) return false;

        Set<Character> characters = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (characters.contains(c)) return false;
            characters.add(c);
        }
        return true;
    }
}