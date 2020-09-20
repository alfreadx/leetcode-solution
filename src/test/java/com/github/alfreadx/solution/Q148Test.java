package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q148Test {


    private static Stream<Arguments> getParameters() {
        List<Integer> input = Arrays.asList(4, 2, 1, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> input2 = Arrays.asList(-1, 5, 3, 4, 0);
        List<Integer> expected2 = Arrays.asList(-1, 0, 3, 4, 5);

        return Stream.of(
                Arguments.of(ListNode.of(input), ListNode.of(expected)),
                Arguments.of(ListNode.of(input2), ListNode.of(expected2))
        );
    }

    //put cut(class under test) in here
    Q148.Solution cut = new Q148.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(ListNode head, ListNode expected) {
        ListNode actual = cut.sortList(head);

        System.out.println(actual);

        assertEquals(expected.toString(), actual.toString());
    }

}