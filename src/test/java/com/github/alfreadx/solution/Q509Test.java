package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q509Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(30, 832040),
                Arguments.of(1, 1),
                Arguments.of(0, 0)
        );
    }

    //put cut(class under test) in here
    Q509.Solution cut = new Q509.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int n, int expected) {
        int actual = cut.fib(n);

        System.out.printf("expected: %d\nactual: %d\n", expected, actual);

        assertEquals(expected, actual);
    }

}