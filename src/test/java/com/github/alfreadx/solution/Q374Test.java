package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q374Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(10, 6),
                Arguments.of(10, 10),
                Arguments.of(2126753390, 1702766719)
        );
    }

    //put cut(class under test) in here
    Q374.Solution cut = new Q374.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int n, int target) {
        cut.target = target;

        int result = cut.guessNumber(n);

        assertEquals(target, result);
    }

}