package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q82Test {


    private static Stream<Arguments> getParameters() {
        List<Integer> input = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 5);
        List<Integer> input2 = Arrays.asList(1, 1, 1, 2, 3);
        List<Integer> expected2 = Arrays.asList(2, 3);


        return Stream.of(
                Arguments.of(ListNode.of(input), ListNode.of(expected)),
                Arguments.of(ListNode.of(input2), ListNode.of(expected2))
        );
    }

    //put cut(class under test) in here
    Q82.Solution cut = new Q82.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(ListNode input, ListNode expected) {
        ListNode actual = cut.deleteDuplicates(input);

        System.out.println(actual);

        assertEquals(expected.toString(), actual.toString());
    }

}