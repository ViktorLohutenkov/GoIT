package GoIt_HomeWork_9;

import java.util.Arrays;

public class MyQueue<E> {
   private E[] myArray;
   private int capacity;
   private int size;
   private int head;
   private int tail;
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
            throw new IndexOutOfBoundsException("Queue is full");
        }
        tail = (tail + 1) % capacity;
        myArray[tail] = value;
        size++;
    }
    public int size() {
        return size;
    }
    public void clear() {
        myArray = (E[]) new Object[0];

    }
    public E peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return myArray[head];
    }
    public E poll() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        E arr = myArray[head];
        myArray[head] = null;
        head = (head + 1) % capacity;
        size--;
        return arr;
    }
    @Override
    public String toString() {

        return "MyQueue " + Arrays.toString(myArray);
    }
}
