package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q278Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(5, 4, 4),
                Arguments.of(2147483647, 2147483647, 2147483647)
        );
    }

    //put cut(class under test) in here
    Q278.Solution cut = new Q278.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(int input, int badVersion, int exp) {
        // given
        cut.badVersion = badVersion;

        int actual = cut.firstBadVersion(input);

        System.out.printf("badVersion: %d\n", badVersion);
        System.out.printf("expected: %d\n", exp);
        System.out.printf("actual: %d\n", actual);

        System.out.printf("call count: %d\n", cut.count);

        assertEquals(exp, actual);
    }

}