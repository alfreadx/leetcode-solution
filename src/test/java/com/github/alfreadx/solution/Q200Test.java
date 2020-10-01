package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q200Test {


    private static Stream<Arguments> getParameters() {
        char[][] input1 = new char[][]{
                new char[]{'1', '1', '1', '1', '0'},
                new char[]{'1', '1', '0', '1', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '0', '0', '0'}
        };

        char[][] input2 = new char[][]{
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '1', '0', '0'},
                new char[]{'0', '0', '0', '1', '1'}
        };

        return Stream.of(
                Arguments.of(input1, 1),
                Arguments.of(input2, 3)
        );
    }

    //put cut(class under test) in here
    Q200.Solution cut = new Q200.Solution();


    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(char[][] input, int expected) {
        int actual = cut.numIslands(input);

        System.out.printf("expected: %d\n", expected);
        System.out.printf("actual: %s\n", actual);

        assertEquals(expected, actual);
    }

}