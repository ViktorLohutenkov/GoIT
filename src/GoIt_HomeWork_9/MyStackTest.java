package GoIt_HomeWork_9;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);

        System.out.println("Size - " + stack.size());

        System.out.println("Peek - " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Size - " + stack.size());

        stack.remove(0);
        System.out.println("After remove " + stack);
        System.out.println("size = " + stack.size());
        System.out.println("stack = " + stack);
        stack.pop();
        System.out.println("stack.isEmpty() = " + stack.isEmpty());

        stack.clear();
        System.out.println("Empty - " + stack);


    }
}
