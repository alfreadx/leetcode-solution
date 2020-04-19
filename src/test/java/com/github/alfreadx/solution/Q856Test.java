package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q856Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of("()", 1),
                Arguments.of("(())", 2),
                Arguments.of("()()", 2),
                Arguments.of("(()())", 4),
                Arguments.of("(()(()))", 6)
        );
    }

    //put cut(class under test) in here
    Q856.Solution cut = new Q856.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String input, int expected) {

        int result = cut.scoreOfParentheses(input);
        System.out.println(result);

        assertEquals(expected, result);
    }

}