package GoIt_HomeWork_9;

public class MyArrayListTest {


    public static void main(String[] args) {
        MyArrayList listTests = new MyArrayList();

        listTests.add("1");
        listTests.add("Viktor");
        System.out.println("listTests = " + listTests);

        System.out.println(listTests.size());
        System.out.println("listTests.get(0) = " + listTests.get(0));

        listTests.remove(1);
        System.out.println("listTests = " + listTests);

    }
}
