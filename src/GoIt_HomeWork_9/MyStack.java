package GoIt_HomeWork_9;
import java.util.Arrays;
public class MyStack<E> {
    private Object[] arrayStack;
    private int top;
    private int maxCapacity;
    public MyStack(int size) {
        maxCapacity = size;
        arrayStack = new Object[maxCapacity];
        top = -1;
    }
    public boolean isEmpty() {

        return top == -1;
    }
    public boolean isFull() {

        return top == maxCapacity - 1;
    }
    public void push(E value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("The stack is full");
        }
        arrayStack[++top] = value;
    }
    public E pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("The stack is empty");
        }
        return (E) arrayStack[top--];
    }
    public E peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("The stack is empty");
        }
        return (E) arrayStack[top];
    }
    public int size() {
        return top + 1;
    }
    public void clear() {
        arrayStack = (E[]) new Object[0];
    }
    public E remove(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("The stack is empty");
        } else {
            E removedElement = (E) arrayStack[index];
            for (int i = index; i < top; i++) {
                arrayStack[i] = arrayStack[i + 1];
            }
            top--;
            return removedElement;
        }
    }
    @Override
    public String toString() {
        return "MyStack " + Arrays.toString(arrayStack);
    }
}



