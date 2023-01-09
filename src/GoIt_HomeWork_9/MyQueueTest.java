package GoIt_HomeWork_9;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);

        System.out.println("First element " + queue.peek());

        System.out.println("poll() = " + queue.poll());
        queue.poll();
        System.out.println(queue);
        System.out.println("Size - " + queue.size());

        queue.clear();
        System.out.println("queue = " + queue);

        queue.add(40);
        queue.add(50);
        System.out.println("queue = " + queue);
        queue.poll();
        System.out.println("queue = " + queue);
    }
}
