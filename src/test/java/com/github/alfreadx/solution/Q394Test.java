package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q394Test {


    private static Stream<Arguments> getParameters(){
        return Stream.of(
                Arguments.of("3[a]2[bc]", "aaabcbc"),
                Arguments.of("3[a2[c]]", "accaccacc"),
                Arguments.of("2[abc]3[cd]ef", "abcabccdcdcdef"),
                Arguments.of("abc3[cd]xyz", "abccdcdcdxyz"),
                Arguments.of("ab12[xy]", "abxyxyxyxyxyxyxyxyxyxyxyxy"),
                Arguments.of("100[leetcode]", "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode")
        );
    }

    //put cut(class under test) in here
    Q394.Solution cut = new Q394.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String input, String expected){
        String actual = cut.decodeString(input);

        System.out.printf("expected: %s\n", expected);
        System.out.printf("actual: %s\n", actual);


        assertEquals(expected, actual);
    }

}