package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1641Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(1, 5),
                Arguments.of(2, 15),
                Arguments.of(3, 35),
                Arguments.of(3, 35),
                Arguments.of(4, 70),
                Arguments.of(5, 126),
                Arguments.of(6, 210),
                Arguments.of(7, 330),
                Arguments.of(8, 495),
                Arguments.of(33, 66045)
        );
    }

    //put cut(class under test) in here
    Q1641.Solution cut = new Q1641.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int n, int expected) {
        int actual = cut.countVowelStrings(n);

        assertEquals(expected, actual);
    }

}