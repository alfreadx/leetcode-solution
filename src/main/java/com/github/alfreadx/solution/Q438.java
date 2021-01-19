package com.github.alfreadx.solution;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q438 {

    /**
     * the Solution class
     */
    static class Solution {

        /**
         * put the method in here
         */
        public List<Integer> findAnagrams(String s, String p) {
            if (s == null || p == null || s.isBlank() || p.isBlank())
                return Collections.emptyList();

            int targetLen = p.length();
            int right = 0, left = 0;
            int match = 0;

            Map<Character, Integer> needs = p.chars()
                    .mapToObj(i -> (char) i)
                    .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum));

            Map<Character, Integer> window = new HashMap<>();
            List<Integer> result = new ArrayList<>();


            while (right < s.length()) {
                char c1 = s.charAt(right);
                if (needs.containsKey(c1)) {
                    window.compute(c1, (k, v) -> v == null ? 1 : v + 1);
                    if (window.get(c1).equals(needs.get(c1))) match++;
                }
                right++;

                while (match == needs.size()) {
                    if (right - left == targetLen) {
                        result.add(left);
                    }
                    char c2 = s.charAt(left);
                    if (needs.containsKey(c2)) {
                        window.compute(c2, (k, v) -> v == null ? 0 : v - 1);
                        if (window.get(c2).compareTo(needs.get(c2)) < 0) match--;
                    }
                    left++;
                }
            }

            return result;
        }

    }

}