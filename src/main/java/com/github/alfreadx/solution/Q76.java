package com.github.alfreadx.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q76 {

    /**
     * the Solution class
     * the solution got Accepted
     */
    static class Solution {
        public String minWindow(String s, String t) {

            int left = 0, right = 0;
            int start = 0, minLen = Integer.MAX_VALUE;

            Map<Character, Integer> needs = t.chars()
                    .mapToObj(i -> (char) i)
                    .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum));

            Map<Character, Integer> window = new HashMap<>();

            int matches = 0;

            while (right < s.length()) {
                char c1 = s.charAt(right);
                if (needs.containsKey(c1)) {
                    window.compute(c1, (k, v) -> v == null ? 1 : v + 1);
                    if (window.get(c1).equals(needs.get(c1))) matches++;
                }
                right++;

                while (matches == needs.size()) {
                    if (right - left < minLen) {
                        start = left;
                        minLen = right - left;
                    }
                    char c2 = s.charAt(left);
                    if (needs.containsKey(c2)) {
                        window.compute(c2, (k, v) -> v == null ? 0 : v - 1);
                        if (window.get(c2).compareTo(needs.get(c2)) < 0) matches--;
                    }
                    left++;
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
        }
    }

    /**
     * the Solution class
     * the solution got Time Limit Exceeded
     */
    static class SolutionTLE {
        /**
         * put the method in here
         */
        public String minWindow(String s, String t) {

            int left = 0, right = 0;
            int start = 0, minLen = Integer.MAX_VALUE;

            Map<Character, Integer> needs = count(t);

            while (right < s.length()) {
                right++;

                String sub = s.substring(left, right);
                while (isValid(needs, sub, t)) {
                    if (right - left < minLen) {
                        start = left;
                        minLen = right - left;
                    }
                    left++;
                    sub = s.substring(left, right);
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
        }

        private Map<Character, Integer> count(String text) {
            return text.chars()
                    .mapToObj(i -> (char) i)
                    .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum));
        }

        private boolean isValid(Map<Character, Integer> needs, String s, String t) {
            if (s.length() < t.length()) return false;

            Map<Character, Integer> window = count(s);
            for (Map.Entry<Character, Integer> entry : needs.entrySet()) {
                Integer other = window.get(entry.getKey());
                if (other == null || other < entry.getValue())
                    return false;
            }

            return true;
        }

    }


}