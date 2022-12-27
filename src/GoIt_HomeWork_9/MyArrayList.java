package GoIt_HomeWork_9;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class MyArrayList  {
   private String [] elements;
   private static final int DEFAULT_CAPACITY = 10;
   private int size;

    public MyArrayList(){

        this.elements = new String[DEFAULT_CAPACITY];
    }

   public MyArrayList (int initialCapacity) {
       if (initialCapacity >= 0) {
           this.elements = new String[initialCapacity];
       } else {
           throw new IllegalArgumentException("Error");
       }
   }
    public void add(String element){
        resizeArr();
        elements[size] = element;
        size++;
    }
    private void resizeArr(){
        if (elements.length == size){
            String [] newArray = new String [elements.length *2];
            System.arraycopy(elements, 0, newArray,0, size);
            elements = newArray;
        }
    }
    public Object remove(int index){
        Objects.checkIndex(index, size);  // index < 0 || index >= length
        String removedElement = elements [index];
        System.arraycopy(elements, index+1, elements,index, size-index-1);
        size--;
        return removedElement;
    }
    public void clear(){
        size = 0;
        elements = new String[DEFAULT_CAPACITY];
    }
    public int size(){

        return size;
    }

    public String get(int index){
        Objects.checkIndex(index,size);
        return elements [index];
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            joiner.add(elements[i]);
        }
        return "[" + joiner + "]";
    }
}

