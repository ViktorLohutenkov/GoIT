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
            increaseQueue();
        }
        tail = (tail + 1) % capacity;
        myArray[tail] = value;
        size++;
    }
    public void increaseQueue(){
        E[] newStack = (E[]) new Object[capacity*2];
        for(int i=0; i<capacity; i++){
            newStack[i] = (E) myArray[i];
        }
        myArray = newStack;
        capacity = capacity*2;
    }
    public int size() {
        return size;
    }
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            myArray[i] = null;
        }
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
