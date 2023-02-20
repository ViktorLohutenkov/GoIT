package GoIt_HomeWork_12;
public class ThreadTime {
            public static void main(String[] args) throws InterruptedException {

                MessageTest messageTest = new MessageTest();
                Thread clock = new Thread(new Clock(messageTest));
                Thread message = new Thread(new Message(messageTest));
                clock.start();
                message.start();
            }
        }
        class MessageTest {
            int minutes = 0;
            int seconds = 0;
            public synchronized void clock() {
                    System.out.println(minutes + ":" + seconds);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    seconds++;
                  if (seconds == 60) {
                        seconds = 0;
                      minutes++;
                  }
                    while (seconds % 5 == 0) {
                        try {
                            System.out.println(minutes + ":" + seconds);
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    notifyAll();
                }

            public synchronized void message() {
                   while (seconds % 5 != 0) {
                       try {
                           wait();
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
                   seconds++;
                    System.out.println("Прошло 5 секунд");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    notifyAll();
                }
            }
      class Clock implements Runnable {
            MessageTest messageTest;
            public Clock(MessageTest messageTest) {

                this.messageTest = messageTest;
            }
            @Override
            public void run() {
                while (true) {
                    messageTest.clock();
                }
            }
        }
        class Message implements Runnable {
            MessageTest messageTest;
            public Message(MessageTest messageTest) {
                this.messageTest = messageTest;
            }
            @Override
            public void run() {
                while (true) {
                    messageTest.message();
                }
            }
        }

