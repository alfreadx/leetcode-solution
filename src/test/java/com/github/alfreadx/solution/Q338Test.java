package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q338Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(2, new int[]{0, 1, 1}),
                Arguments.of(5, new int[]{0, 1, 1, 2, 1, 2})
        );
    }

    //put cut(class under test) in here
    Q338.Solution cut = new Q338.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int input, int[] expected) {
        int[] actual = cut.countBits(input);

        System.out.printf("expected: %s\n", Arrays.toString(expected));
        System.out.printf("actual: %s\n", Arrays.toString(actual));

        assertArrayEquals(expected, actual);
    }

}