package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q138Test {


    private static Stream<Arguments> getParameters() {
        // [[7,null],[13,0],[11,4],[10,2],[1,0]]
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(7, null),
                Arrays.asList(13, 0),
                Arrays.asList(11, 4),
                Arrays.asList(10, 2),
                Arrays.asList(1, 0)
        );
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(7, null),
                Arrays.asList(13, 0),
                Arrays.asList(11, 4),
                Arrays.asList(10, 2),
                Arrays.asList(1, 0)
        );

        // [[3,null],[3,0],[3,null]]
        List<List<Integer>> input2 = Arrays.asList(
                Arrays.asList(3, null),
                Arrays.asList(3, 0),
                Arrays.asList(3, null)
        );
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(3, null),
                Arrays.asList(3, 0),
                Arrays.asList(3, null)
        );


        return Stream.of(
                Arguments.of(Node.of(input), Node.of(expected)),
                Arguments.of(Node.of(input2), Node.of(expected2))
        );
    }

    //put cut(class under test) in here
    Q138.Solution cut = new Q138.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(Node input, Node expected) {
        Node actual = cut.copyRandomList(input);

        System.out.println(input);
        System.out.println(actual);
        System.out.println(expected);

        assertEquals(expected.toString(), actual.toString());
    }

}