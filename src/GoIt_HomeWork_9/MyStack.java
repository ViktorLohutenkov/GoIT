package GoIt_HomeWork_9;
import java.util.Arrays;
public class MyStack<T> {
    private T[] stackArray;
    private int stackSize;
    private int top;
    public MyStack(int size) {
        this.stackSize = size;
        this.stackArray = (T[]) new Object[stackSize];
        this.top = -1;
    }
    public boolean isStackEmpty() {
        return (top == -1);
    }
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
    public void push(T value) {
        if (isStackFull()) {
            increaseStack();
        }
        stackArray[++top] = value;
    }
    private void increaseStack() {
        T[] newStack = (T[]) new Object[stackSize * 2];
        for (int i = 0; i < stackSize; i++) {
            newStack[i] = stackArray[i];
        }
        stackArray = newStack;
        stackSize = stackSize * 2;
    }
    public T peek() {
        return stackArray[top];
    }
    public T pop() {
        if (isStackEmpty()) {
            throw new IndexOutOfBoundsException("The stack is empty");
        }
        T entry = stackArray[top--];
        stackArray[top+1] = null;
        return entry;
    }
     public int size() {
        return top + 1;
    }
    public void clear() {
        stackArray = (T[]) new Object[stackSize];
    }
    public T remove(int index) {
        if (isStackEmpty()) {
            throw new IndexOutOfBoundsException("The stack is empty");
        } else {
            T removedElement = stackArray[index];
            for (int i = index; i < top + 1; i++) {
                stackArray[i] = stackArray[i + 1];
            }
            top--;
            return removedElement;
        }
    }
    @Override
    public String toString() {
        return "MyStack " + Arrays.toString(stackArray);
    }
}


