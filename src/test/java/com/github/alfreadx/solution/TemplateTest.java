package com.github.alfreadx.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TemplateTest {

    private static TemplateListNode.ListNode getTestData(){
        TemplateListNode.ListNode head = new TemplateListNode.ListNode(3);
        head.next = new TemplateListNode.ListNode(2);
        head.next.next = new TemplateListNode.ListNode(0);
        head.next.next.next = new TemplateListNode.ListNode(-4);
        head.next.next.next.next = new TemplateListNode.ListNode(5);

        return head;
    }

    private static Stream<Arguments> getParameters(){
        return Stream.of(
                Arguments.of(getTestData())
        );
    }

    // class under test
    private TemplateListNode.Solution cut = new TemplateListNode.Solution();

    @ParameterizedTest
    @MethodSource("getParameters")
    public void test(TemplateListNode.ListNode head){

        String print = cut.print(head);

        assertEquals("ListNode{val=3, next=ListNode{val=2, next=ListNode{val=0, next=ListNode{val=-4, next=ListNode{val=5, next=null}}}}}", print);
    }

}