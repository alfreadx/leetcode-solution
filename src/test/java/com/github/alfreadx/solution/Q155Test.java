package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Q155Test {


    private static Stream<Arguments> getParameters() {
        List<String> operations = Arrays.asList("MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin");
        List<Integer> elements = Arrays.asList(null, -2, 0, -3, null, null, null, null);
        List<Integer> expected = Arrays.asList(null, null, null, null, -3, null, 0, -2);
        List<String> operations2 = Arrays.asList("MinStack", "push", "push", "push", "pop", "push", "getMin", "pop", "top", "getMin");
        List<Integer> elements2 = Arrays.asList(null, 7, 6, 8, null, 2, null, null, null, null);
        List<Integer> expected2 = Arrays.asList(null, null, null, null, null, null, 2, null, 6, 6);

        return Stream.of(
                Arguments.of(operations, elements, expected),
                Arguments.of(operations2, elements2, expected2)
        );
    }

    //put cut(class under test) in here
    Q155.Solution cut = new Q155.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(List<String> operations, List<Integer> elements, List<Integer> expected) {
        List<Integer> actual = cut.operation(operations, elements);

        System.out.printf("expected: %s\n", expected);
        System.out.printf("actual: %s\n", actual);

        assertIterableEquals(expected, actual);
    }

}