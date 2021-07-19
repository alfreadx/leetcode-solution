package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q268Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 1}, 2),
                Arguments.of(new int[]{0, 1}, 2),
                Arguments.of(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8),
                Arguments.of(new int[]{0}, 1),
                Arguments.of(new int[]{1}, 0)
        );
    }

    //put cut(class under test) in here
    Q268.Solution cut = new Q268.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] nums, int expected) {
        int actual = cut.missingNumber(nums);

        assertEquals(expected, actual);
    }

}