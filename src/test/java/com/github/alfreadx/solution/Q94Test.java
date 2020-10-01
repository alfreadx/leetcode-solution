package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Q94Test {


    private static Stream<Arguments> getParameters() {
        TreeNode input1 = new TreeNode(1);
        input1.right = new TreeNode(2);
        input1.right.left = new TreeNode(3);
        List<Integer> expected1 = Arrays.asList(1, 3, 2);

        TreeNode input2 = new TreeNode(1);
        input2.left = new TreeNode(2);
        List<Integer> expected2 = Arrays.asList(2, 1);

        TreeNode input3 = new TreeNode(1);
        input3.right = new TreeNode(2);
        List<Integer> expected3 = Arrays.asList(1, 2);


        return Stream.of(
                Arguments.of(input1, expected1),
                Arguments.of(null, Collections.emptyList()),
                Arguments.of(new TreeNode(1), Collections.singletonList(1)),
                Arguments.of(input2, expected2),
                Arguments.of(input3, expected3)

        );
    }

    //put cut(class under test) in here
    Q94.Solution cut = new Q94.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(TreeNode input, List<Integer> expected) {
        List<Integer> actual = cut.inorderTraversal(input);

        System.out.printf("expected: %s\n", expected);
        System.out.printf("actual: %s\n", actual);

        assertIterableEquals(expected, actual);
    }

}