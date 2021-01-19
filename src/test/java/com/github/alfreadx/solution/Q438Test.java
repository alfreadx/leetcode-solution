package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class Q438Test {


    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of("cbaebabacd", "abc", Arrays.asList(0, 6)),
                Arguments.of("abab", "ab", Arrays.asList(0, 1, 2)),
                Arguments.of("cbadbecqyuakbc", "bca", Arrays.asList(0)),
                Arguments.of("cbadbecqyuakbcdbaa", "aba", Arrays.asList(15))
        );
    }

    //put cut(class under test) in here
    Q438.Solution cut = new Q438.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(String s, String p, List<Integer> expected) {
        List<Integer> actual = cut.findAnagrams(s, p);

        System.out.printf("expected: %s\nactual: %s\n", expected, actual);

        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }

}