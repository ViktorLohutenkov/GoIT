package GoIt_HomeWork_9;

public class MyLinkedList <E> {

    private Node <E> head;
    private Node <E> tail;
    private int size;

    public MyLinkedList() {

        size = 0;
    }
    private static class Node <E> {
         E element;
         Node <E> next;
         Node <E> prev;

        public Node(E value) {

            this.element = value;
        }
    }

    public void add(E value) {
        Node <E> newNode = new Node<>(value);
        if (size == 0){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void removeFirstNode() {
        if (head == null){
            throw new IndexOutOfBoundsException("Empty");
        }
        Node <E> first = head;
        if (head.next == null){
            tail = null;
        }else {
            head.next.prev = null;
        }
        head = head.next;
        size--;
    }
    public void removeLastNode() {
        if (tail == null){
            throw new IndexOutOfBoundsException("Empty");
        }
        Node <E> last = tail;
        if (head.next == null){
            head = null;
        }else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        size--;
    }
    public Object remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Error");
        }
        if (index == 0) {
            removeFirstNode();
        } else if (index == size - 1) {
            removeLastNode();
        } else {
            Node <E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
        return index;
    }

    public void clear(){
        head = tail = null;
        size = 0;
    }

    public int size(){
        return this.size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {          //
            throw new IndexOutOfBoundsException("Error");
        }
        if (index == size - 1){
            return  tail.element;
        }
        Node <E> result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.element;
    }

    @Override
    public String toString() {
      Node node = this.head;
        StringBuilder builder= new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            builder = builder.append(node.element + ", ");
            node = node.next;
        }
        builder = builder.append("]");
        return builder.toString();
    }
}

 /*
     public Object remove(int index){
        Node current = head;
        while (current.element != index) {
            current = current.next;
        }
        if (current == null) {
            return index;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        size--;
        return current.element;
    }

*/