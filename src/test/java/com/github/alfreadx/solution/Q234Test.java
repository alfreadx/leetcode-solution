package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q234Test {


    private static Stream<Arguments> getParameters() {
        List<Integer> input = Arrays.asList(1, 2);
        List<Integer> input2 = Arrays.asList(1, 2, 2, 1);

        return Stream.of(
                Arguments.of(ListNode.of(input), false),
                Arguments.of(ListNode.of(input2), true),
                Arguments.of(null, true)
        );
    }

    //put cut(class under test) in here
    Q234.Solution cut = new Q234.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(ListNode input, boolean expected) {
        boolean actual = cut.isPalindrome(input);

        System.out.println(actual);

        assertEquals(expected, actual);
    }

}