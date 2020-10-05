package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q153Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 1, 2}, 1),
                Arguments.of(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)
        );
    }

    //put cut(class under test) in here
    Q153.Solution cut = new Q153.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] nums, int exp) {
        int actual = cut.findMin(nums);

        System.out.printf("expected: %d\n", exp);
        System.out.printf("actual: %d\n", actual);

        assertEquals(exp, actual);
    }

}