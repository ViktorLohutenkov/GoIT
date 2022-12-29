package GoIt_HomeWork_9;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class MyArrayList <T> {
   private T [] elements;
   private static final int DEFAULT_CAPACITY = 10;
   private int size;

    public MyArrayList(){

        this.elements = (T[]) new  Object[DEFAULT_CAPACITY];
    }

   public MyArrayList (int initialCapacity) {
       if (initialCapacity >= 0) {
           this.elements = (T[]) new Object[initialCapacity];
       } else {
           throw new IllegalArgumentException("Error");
       }
   }
    public void add(T element){
        resizeArr();
        elements[size] = (T) element;
        size++;
    }
    private void resizeArr(){
        if (elements.length == size){
            Object [] newArray = new Object [elements.length *2];
            System.arraycopy(elements, 0, newArray,0, size);
            elements = (T[]) newArray;
        }
    }
    public T remove(int index){
        Objects.checkIndex(index, size);  // index < 0 || index >= length
        T removedElement = (T) elements [index];
        System.arraycopy(elements, index+1, elements,index, size-index-1);
        size--;
        return removedElement;
    }
    public void clear(){
        size = 0;
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }
    public int size(){

        return size;
    }

    public T get(int index){
        Objects.checkIndex(index,size);
        return (T) elements [index];
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            joiner.add((CharSequence) elements[i]);
        }
        return "[" + joiner + "]";
    }
}

