package GoIt_HomeWork_12;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class FizzBuzzThread {
    public static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);
        FizzBuzzCondition fizzBuzzCondition = new FizzBuzzCondition();
        service.submit(fizzBuzzCondition::fizz);
        service.submit(fizzBuzzCondition::buzz);
        service.submit(fizzBuzzCondition::fizzbuzz);
        service.submit(fizzBuzzCondition::number);
        service.submit(() -> {
               while (!queue.isEmpty()) {
                   System.out.println(queue.poll());
           }
        });
        service.shutdown();
    }
}
