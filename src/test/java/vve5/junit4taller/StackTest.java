package vve5.junit4taller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    public Stack<Integer> stack;

    @Before
    public void setup() {
        stack = new Stack<>();
    }

    @Test
    public void push_shouldAddObject_whenGivenValidObject() {
        Integer num = 1;

        stack.push(num);

        assertEquals(1, stack.size());
        assertEquals(num, stack.peek());
    }

    @Test
    public void push_shouldAddManyObjects_whenGivenValidValues() {
        Integer[] nums = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : nums) {
            stack.push(num);
        }

        assertEquals(nums.length, stack.size());
        assertArrayEquals(nums, stack.toArray());
    }

    @Test(expected = IllegalArgumentException.class)
    public void push_shouldThrowException_whenGivenNull() {
        stack.push(null);
    }

    @Test
    public void pop_shouldRemoveObject_whenStackIsNotEmpty() {
        int pushedValue = 1;
        stack.push(pushedValue);

        int poppedValue = stack.pop();

        assertEquals(pushedValue, poppedValue);
        assertEquals(0, stack.size());
    }

    @Test
    public void pop_shouldReturnNull_whenStackIsEmpty() {
        Integer returnValue = stack.pop();
        assertNull(returnValue);
    }

    @Test
    public void peek_shouldReturnLastObject_whenStackIsNotEmpty() {
        int pushedValue = 1;
        stack.push(pushedValue);

        int peekedValue = stack.peek();

        assertEquals(pushedValue, peekedValue);
        assertEquals(1, stack.size());
    }

    @Test
    public void peek_shouldReturnNull_whenStackIsEmpty() {
        Integer returnValue = stack.peek();
        assertNull(returnValue);
    }

    @Test
    public void size_shouldBeZero_whenStackIsInstantiated() {
        assertEquals(0, stack.size());
    }

    @Test
    public void size_shouldIncrement_whenObjectIsPushed() {
        int sizeBeforePush = stack.size();
        stack.push(1);
        int sizeAfterPush = stack.size();

        assertTrue(sizeAfterPush > sizeBeforePush);
    }

    @Test
    public void size_shouldDecrement_whenObjectIsPopped() {
        stack.push(1);
        int sizeBeforePop = stack.size();
        stack.pop();
        int sizeAfterPop = stack.size();

        assertTrue(sizeAfterPop < sizeBeforePop);
    }

}