package com.codersbay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void pushTest() throws StackTooSmall {
        Stack myStack = new Stack();
        myStack.push(1);
        int result = myStack.pop();
        assertEquals(result, 1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(myStack.pop(), 3);
        assertEquals(myStack.pop(), 2);
        assertTrue(myStack.size() == 0);
    }

    @Test
    public void peekTest() {
        Stack myStack = new Stack();
        myStack.push(1);
        assertEquals(myStack.peek(), 1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(myStack.peek(), 3);
        assertTrue(myStack.size() == 3);
    }

    @Test
    public void pushToSmall() {
        Stack myStack = new Stack();
        //myStack.pop();
        assertThrows(StackTooSmall.class, () -> {
            myStack.pop();
        });
    }

}
