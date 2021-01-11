package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q300Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{10, 9, 2, 5, 3, 7, 101, 18}, 4),
                Arguments.of(new int[]{0, 1, 0, 3, 2, 3}, 4),
                Arguments.of(new int[]{7, 7, 7, 7, 7, 7, 7}, 1)
        );
    }

    //put cut(class under test) in here
    Q300.Solution cut = new Q300.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] nums, int expected) {
        int actual = cut.lengthOfLIS(nums);

        System.out.printf("expected: %d\nactual: %d\n", expected, actual);

        assertEquals(expected, actual);
    }

}