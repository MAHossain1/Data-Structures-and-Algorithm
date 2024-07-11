package Stacks;

import java.util.Arrays;

public class Stack {
    // Initialize array space from an arbitrary starting point.
    private int[] items = new int[6];
    private int count;

    public void push(int item) {
        // Throws StackOverflowError if the stack's data store capacity is exceeded.
        if (count == items.length)
            throw new StackOverflowError();

        items[count] = item;
        count++;
    }

    public int pop() {
        // Throws error if there is nothing to pop from our stack
        if (count == 0)
            throw new IllegalStateException();

        return items[--count];
    }

    public int peek() {
        // Throws error if there is nothing to peek from our stack
        if (count == 0)
            throw new IllegalStateException();

        return items[count - 1];
    }

    // Boolean method which returns whether our stack empty or not.
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        // Prints from index 0 to count since we only want to show what we actually have and not the extra space.
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
