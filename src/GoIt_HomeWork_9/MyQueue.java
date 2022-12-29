package GoIt_HomeWork_9;

import java.util.Arrays;

public class MyQueue<E> {
    E[] myArray;
    int capacity;
    int size;
    int head;
    int tail;

    MyQueue(int maxSize) {

        this.capacity = maxSize;
        myArray = (E[]) new Object[maxSize];
        head = 0;
        tail = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return (size == capacity);
    }

    public void add(E value) {
        if (isFull()) {
            System.out.println("Empty");
            System.exit(-1);
        }
        System.out.println(value);
        tail = (tail + 1) % capacity;
        myArray[tail] = value;
        size++;
    }

    public int size() {
        return capacity;
    }

    public void clear() {
        for (int i = 0; i <= size; i++) {
            capacity = 0;
            tail = 0;
        }
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            System.exit(-1);
        }
        return myArray[head];
    }

    public E poll() {
        if (isEmpty()) {
            System.out.println("Empty");
            System.exit(-1);
        }
        E arr = myArray[head];
        System.out.println("Removing " + arr);
        head = (head + 1) % capacity;
        size--;
        return arr;
    }

    @Override
    public String toString() {
        return "MyQueue " + Arrays.toString(myArray);
    }
}
