package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q3Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbbb", 1),
                Arguments.of("pwwkew", 3)
        );
    }

    // class under test
    private Q3.Solution cut = new Q3.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String input, int length) {

        int result = cut.lengthOfLongestSubstring(input);

        assertEquals(length, result);
    }
}