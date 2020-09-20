package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q203Test {


    private static Stream<Arguments> getParameters() {
        List<Integer> input = Arrays.asList(1, 2, 6, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> input2 = Arrays.asList(1, 2, 5, 5, 6, 9, 5, 3);
        List<Integer> expected2 = Arrays.asList(1, 2, 6, 9, 3);


        return Stream.of(
                Arguments.of(ListNode.of(input), 6, ListNode.of(expected)),
                Arguments.of(ListNode.of(input2), 5, ListNode.of(expected2))
        );
    }

    //put cut(class under test) in here
    Q203.Solution cut = new Q203.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(ListNode head, int val, ListNode expected) {
        ListNode actual = cut.removeElements(head, val);

        System.out.println(actual);

        assertEquals(expected.toString(), actual.toString());
    }

}