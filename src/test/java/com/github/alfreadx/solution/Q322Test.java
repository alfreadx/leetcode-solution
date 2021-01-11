package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q322Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 5}, 11, 3),
                Arguments.of(new int[]{2}, 3, -1),
                Arguments.of(new int[]{1}, 0, 0),
                Arguments.of(new int[]{1}, 1, 1),
                Arguments.of(new int[]{1}, 2, 2)
        );
    }

    //put cut(class under test) in here
    Q322.Solution cut = new Q322.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] coins, int amount, int expected) {
        int actual = cut.coinChange(coins, amount);

        System.out.printf("expected: %d\nactual: %d\n", expected, actual);

        assertEquals(expected, actual);
    }

}