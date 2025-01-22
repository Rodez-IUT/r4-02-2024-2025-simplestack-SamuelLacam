package org.example;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SimpleStack implements Stack {

    private ArrayList<Item> elements;

    public SimpleStack() {
        elements = new ArrayList<>();
    }

    /**
     * Tests if this stack is empty
     */
    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return elements.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item an item of the stack
     */
    @Override
    public void push(Item item) {
        elements.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    @Override
    public Item peek() throws EmptyStackException {
        try {
            return elements.getLast();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        try {
            return elements.removeLast();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }
}
