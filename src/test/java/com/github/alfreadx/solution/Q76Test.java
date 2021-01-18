package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q76Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of("ADOBECODEBANC", "ABC", "BANC"),
                Arguments.of("a", "a", "a"),
                Arguments.of("a", "aa", "")
        );
    }

    //put cut(class under test) in here
    Q76.Solution cut = new Q76.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String s, String t, String expected) {
        String actual = cut.minWindow(s, t);

        System.out.printf("expected: \"%s\"\nactual: \"%s\"\n", expected, actual);

        assertEquals(expected, actual);
    }

}