package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q35Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
                Arguments.of(new int[]{1, 3, 5, 6}, 0, 0)
        );
    }

    //put cut(class under test) in here
    Q35.Solution cut = new Q35.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] nums, int target, int exp) {
        int actual = cut.searchInsert(nums, target);

        System.out.printf("expected: %d\n", exp);
        System.out.printf("actual: %d\n", actual);

        assertEquals(exp, actual);
    }

}