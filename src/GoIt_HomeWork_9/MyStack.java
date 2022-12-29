package GoIt_HomeWork_9;

import java.util.Arrays;

public class MyStack <E> {
    private Object [] arrayStack;      // E
    private int top;
    private int capacity;

    public MyStack(int size) {
        capacity = size;
        arrayStack = new Object[size];   // (E[])
        top = -1;
    }

    public boolean isEmpty() {

        return top == -1;
    }
    public boolean isFull() {

        return top == capacity - 1;
    }

    public void push(E value) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        }
            top = top + 1;
            arrayStack[top] = value;
        }

    public E pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        System.out.println("Removing " + peek());
        return (E) arrayStack[top--];

    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
            return arrayStack[top];
    }
    public int size() {

        return top + 1;
    }

    public void clear() {

        arrayStack = new Object[0];
    }

    public E remove(int index) {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return null;
        } else {
            E removedElement = (E) arrayStack[index];
            for(int i = index; i < capacity-1; i++){
                arrayStack[i] = arrayStack[i+1];
            }
            capacity--;
            return removedElement;
        }
    }

    @Override
    public String toString() {
        return "MyStack " + Arrays.toString(arrayStack);
    }
}




