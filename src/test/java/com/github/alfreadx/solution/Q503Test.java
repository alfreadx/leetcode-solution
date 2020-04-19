package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q503Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, new int[]{2, -1, 2})
        );
    }

    //class under test
    private Q503.Solution cut = new Q503.Solution();


    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int[] nums, int[] expected) {

        int[] result = cut.nextGreaterElements(nums);

        System.out.println(Arrays.toString(result));
        assertArrayEquals(expected, result);

    }

}