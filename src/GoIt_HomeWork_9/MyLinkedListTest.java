package GoIt_HomeWork_9;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);


        System.out.println("list.size() = " + list.size());

        System.out.println("list.get(2) = " + list.get(2));

        list.remove(3);
        System.out.println(list);

        list.clear();
        System.out.println("list = " + list);


    }
}
