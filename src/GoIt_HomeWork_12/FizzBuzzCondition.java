package GoIt_HomeWork_12;
import java.util.concurrent.atomic.AtomicInteger;
import static GoIt_HomeWork_12.FizzBuzzThread.queue;
public class FizzBuzzCondition {
    private final int n = 15;
    public static volatile AtomicInteger number = new AtomicInteger(1);
    public synchronized void fizz() {
        while (number.get() <= n) {
            if (number.get() % 3 == 0 && number.get() % 5 != 0) {
                queue.add("fizz");
                number.incrementAndGet();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public synchronized void buzz() {
        while (number.get() <= n) {
            if (number.get() % 5 == 0 && number.get() % 3 != 0) {
                queue.add("buzz");
                number.incrementAndGet();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public synchronized void fizzbuzz() {
        while (number.get() <= n) {
            if (number.get() % 15 == 0) {
                queue.add("fizzbizz");
                number.incrementAndGet();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public synchronized void number() {
        while (number.get() <= n) {
            if (number.get() % 3 != 0 && number.get() % 5 != 0) {
                queue.add(String.valueOf(number));
                number.incrementAndGet();
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}



