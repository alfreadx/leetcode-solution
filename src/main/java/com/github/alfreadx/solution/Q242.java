package com.github.alfreadx.solution;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q242 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public boolean isAnagram(String s, String t) {
            if (s == null || t == null || s.isBlank() || t.isBlank())
                return true;

            Map<Character, Integer> m1 = s.chars().mapToObj(i -> (char) i)
                    .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum));

            Map<Character, Integer> m2 = t.chars().mapToObj(i -> (char) i)
                    .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum));

            return m1.equals(m2);
        }

    }

}