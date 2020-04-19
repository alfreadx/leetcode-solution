package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q496Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1}),
                Arguments.of(new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1}),
                Arguments.of(new int[]{1, 2}, new int[]{6, 2, 1, 5, 4}, new int[]{5, 5}),
                Arguments.of(new int[]{1, 2}, new int[]{6, 2, 3, 1, 5}, new int[]{5, 3})
        );
    }

    //class under test
    private Q496.Solution cut = new Q496.Solution();


    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] num1, int[] num2, int[] expected) {

        int[] result = cut.nextGreaterElement(num1, num2);

        System.out.println(Arrays.toString(result));
        assertArrayEquals(expected, result);

    }

}