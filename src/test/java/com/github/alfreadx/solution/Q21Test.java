package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q21Test {


    private static Stream<Arguments> getParameters() {
        List<Integer> l1 = Arrays.asList(1, 2, 4);
        List<Integer> l2 = Arrays.asList(1, 3, 4);
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 4, 4);

        return Stream.of(
                Arguments.of(ListNode.of(l1), ListNode.of(l2), ListNode.of(expected))
        );
    }

    //put cut(class under test) in here
    Q21.Solution cut = new Q21.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(ListNode l1, ListNode l2, ListNode expected) {
        ListNode actual = cut.mergeTwoLists(l1, l2);

        System.out.println(actual);

        assertEquals(expected.toString(), actual.toString());
    }

}