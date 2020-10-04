package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q704Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
                Arguments.of(new int[]{5}, 5, 0)
        );
    }

    //put cut(class under test) in here
    Q704.Solution cut = new Q704.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] nums, int target, int expected) {
        int actual = cut.search(nums, target);

        System.out.printf("expected: %d\n", expected);
        System.out.printf("actual: %d\n", actual);

        assertEquals(expected, actual);
    }

}