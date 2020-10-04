package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q74Test {


    private static Stream<Arguments> getParameters() {
        int[][] input1 = new int[][]{
                new int[]{1, 3, 5, 7},
                new int[]{10, 11, 16, 20},
                new int[]{23, 30, 34, 50}
        };


        return Stream.of(
                Arguments.of(input1, 3, true),
                Arguments.of(input1, 13, false),
                Arguments.of(new int[0][0], 13, false)
        );
    }

    //put cut(class under test) in here
    Q74.Solution cut = new Q74.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[][] matrix, int target, boolean exp) {
        boolean actual = cut.searchMatrix(matrix, target);

        System.out.printf("expected: %s\n", exp);
        System.out.printf("actual: %s\n", actual);

        assertEquals(exp, actual);
    }

}