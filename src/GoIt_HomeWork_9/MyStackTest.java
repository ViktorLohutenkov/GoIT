package GoIt_HomeWork_9;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);
        System.out.println("Size - " + stack.size());

        System.out.println("Peek - " + stack.peek());

        stack.pop();
        stack.pop();
        System.out.println("After pop() - " + stack);
        System.out.println("Size - " + stack.size());


        stack.remove(0);
        System.out.println("After remove " + stack);
        System.out.println("size = " + stack.size());

        stack.clear();
        System.out.println("Empty - " + stack);

        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(100);
        stack.push(100);
        stack.push(100);
        stack.push(100);
        stack.push(100);
        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());

        stack.pop();
        System.out.println("stack = " + stack);

        stack.clear();
        System.out.println("Empty - " + stack);

        stack.push(10);
        stack.push(10);
        System.out.println("stack = " + stack);
        System.out.println("stack.size() = " + stack.size());
    }
}
