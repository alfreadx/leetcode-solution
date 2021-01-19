package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q242Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false),
                Arguments.of("", "", true)
        );
    }

    //put cut(class under test) in here
    Q242.Solution cut = new Q242.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String s, String t, boolean expected) {
        boolean actual = cut.isAnagram(s, t);

        System.out.printf("expected: %s\nactual: %s\n", expected, actual);

        assertEquals(expected, actual);
    }

}