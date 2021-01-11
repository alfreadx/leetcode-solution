package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1143Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of("abcde", "ace", 3),
                Arguments.of("abc", "abc", 3),
                Arguments.of("abc", "def", 0),
                Arguments.of("mhunuzqrkzsnidwbun", "szulspmhwpazoxijwbq", 6)
        );
    }

    //put cut(class under test) in here
    Q1143.Solution cut = new Q1143.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String text1, String text2, int expected) {
        int actual = cut.longestCommonSubsequence(text1, text2);

        System.out.printf("expected: %d\nactual: %d\n", expected, actual);

        assertEquals(expected, actual);
    }

}