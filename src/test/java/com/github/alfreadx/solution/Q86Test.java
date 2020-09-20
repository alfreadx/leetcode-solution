package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Q86Test {

    private static ListNode getTestData() {
        List<Integer> data = Arrays.asList(1, 4, 3, 2, 5, 2);
        return ListNode.of(data);
    }

    private static ListNode getAnswer() {
        List<Integer> data = Arrays.asList(1, 2, 2, 4, 3, 5);
        return ListNode.of(data);
    }

    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(getTestData(), 3, getAnswer())
        );
    }

    // class under test
    private Q86.Solution cut = new Q86.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(ListNode head, int x, ListNode expected) {

        ListNode actual = cut.partition(head, x);

        System.out.println(actual);

        assertEquals(expected.toString(), actual.toString());
    }

}