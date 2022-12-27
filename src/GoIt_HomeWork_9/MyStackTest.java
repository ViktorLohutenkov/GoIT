package GoIt_HomeWork_9;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        System.out.println("Size - " + stack.size());

        System.out.println("Peek - " + stack.peek());

        stack.pop();
        System.out.println("After pop " + stack);

        stack.remove(1);
        System.out.println("After remove " + stack);

        stack.clear();
        System.out.println("Empty - " + stack);


    }

}
