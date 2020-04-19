package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q739Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 0})
        );
    }

    //class under test
    Q739.Solution cut = new Q739.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] nums, int[] expected) {

        int[] result = cut.dailyTemperatures(nums);

        assertArrayEquals(expected, result);
    }

}