package com.github.alfreadx.solution.helper;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TemplateTest {


    private static Stream<Arguments> getParameters(){
        return Stream.of(
                Arguments.of()
        );
    }

    //put cut(class under test) in here


    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(){


        assertEquals(0, 0);
    }

}