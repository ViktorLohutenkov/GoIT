package GoIt_HomeWork_9;

import java.util.Arrays;

public class MyStack {
    private int[] arrayStack;
    private int top;
    private int capacity;

    public MyStack(int size) {
        capacity = size;
        arrayStack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {

        return top == -1;
    }
    public boolean isFull() {

        return top == capacity - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        }
            top = top + 1;
            arrayStack[top] = value;
        }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        System.out.println("Removing " + peek());
        return arrayStack[top--];

    }

    public int peek() {
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

        arrayStack = new int[0];
    }

    public int remove(int index) {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return 0;
        } else {
            int removedElement = arrayStack[index];
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





