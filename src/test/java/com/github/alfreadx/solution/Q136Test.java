package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q136Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1}, 1),
                Arguments.of(new int[]{4, 1, 2, 1, 2}, 4),
                Arguments.of(new int[]{1}, 1)
        );
    }

    //put cut(class under test) in here
    Q136.Solution cut = new Q136.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] input, int expected) {
        int actual = cut.singleNumber(input);

        System.out.printf("expected: %d\n", expected);
        System.out.printf("actual: %d\n", actual);

        assertEquals(expected, actual);
    }

}