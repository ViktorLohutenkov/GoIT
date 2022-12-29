package GoIt_HomeWork_9;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap <Integer, String> map = new MyHashMap<>();
        map.put(0,"Oleg");
        map.put(1,"Viktor");
        map.put(2,"Sergey");
        map.put(3,"Hanna");
        System.out.println("map = " + map);

        System.out.println("map.get(1) = " + map.get(2));

        map.remove(3);
        System.out.println("map = " + map);

        System.out.println("map.size() = " + map.size());

        map.clear();
        System.out.println("map = " + map);
    }
}
