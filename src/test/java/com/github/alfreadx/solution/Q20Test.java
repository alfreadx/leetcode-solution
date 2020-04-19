package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q20Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("([)]", false),
                Arguments.of("{[]}", true),
                Arguments.of("]", false)
        );
    }

    //put cut(class under test) in here
    Q20.Solution cut = new Q20.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String input, boolean expected) {

        boolean result = cut.isValid(input);

        assertEquals(expected, result);
    }

}