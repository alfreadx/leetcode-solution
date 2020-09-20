package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q150Test {


    private static Stream<Arguments> getParameters() {
        String[] input = new String[]{"2", "1", "+", "3", "*"};
        String[] input2 = new String[]{"4", "13", "5", "/", "+"};
        String[] input3 = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        return Stream.of(
                Arguments.of(input, 9),
                Arguments.of(input2, 6),
                Arguments.of(input3, 22)
        );
    }

    //put cut(class under test) in here
    Q150.Solution cut = new Q150.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String[] tokens, int expected) {
        int actual = cut.evalRPN(tokens);

        System.out.printf("expected: %d\n", expected);
        System.out.printf("actual: %d\n", actual);

        assertEquals(expected, actual);
    }

}