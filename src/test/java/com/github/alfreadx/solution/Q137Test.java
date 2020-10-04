package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q137Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 3, 2}, 3),
                Arguments.of(new int[]{0, 1, 0, 1, 0, 1, 99}, 99)
        );
    }

    //put cut(class under test) in here
    Q137.Solution cut = new Q137.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] input, int expected) {
        int actual = cut.singleNumber(input);

        System.out.printf("expected: %d\n", expected);
        System.out.printf("actual: %d\n", actual);

        assertEquals(expected, actual);
    }

}