package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q66Test {


    //put cut(class under test) in here
    Q66.Solution cut = new Q66.Solution();

    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2}),
                Arguments.of(new int[]{9}, new int[]{1, 0}),
                Arguments.of(new int[]{9, 9}, new int[]{1, 0, 0}),
                Arguments.of(new int[]{9, 8, 9}, new int[]{9, 9, 0}),
                Arguments.of(new int[]{5, 9, 8}, new int[]{5, 9, 9})

        );
    }

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] input, int[] expected) {
        int[] actual = cut.plusOne(input);

        System.out.printf("exp: %s, act: %s\n", Arrays.toString(expected), Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

}