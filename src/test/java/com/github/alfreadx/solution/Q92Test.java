package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q92Test {


    private static Stream<Arguments> getParameters() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 4, 3, 2, 5);
        List<Integer> input2 = Arrays.asList(5);
        List<Integer> expected2 = Arrays.asList(5);


        return Stream.of(
                Arguments.of(ListNode.of(input), 2, 4, ListNode.of(expected)),
                Arguments.of(ListNode.of(input2), 1, 1, ListNode.of(expected2))
        );
    }

    //put cut(class under test) in here
    Q92.Solution cut = new Q92.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(ListNode input, int m, int n, ListNode expected) {

        ListNode actual = cut.reverseBetween(input, m, n);

        System.out.println(actual);

        assertEquals(expected.toString(), actual.toString());
    }

}