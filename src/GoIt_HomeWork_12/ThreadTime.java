package GoIt_HomeWork_12;

public class ThreadTime {
            static Object lock = new Object();

            public static void main(String[] args) throws InterruptedException {

                Worker worker = new Worker();
                Thread clocker = new Thread(new Clock(worker));
                Thread messager = new Thread(new Messanger(worker));
                clocker.start();
                messager.start();
            }
        }

        class Worker {
            int minutes = 0;
            int seconds = 0;
            public void clock() {
                synchronized (ThreadTime.lock) {
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
                            ThreadTime.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    ThreadTime.lock.notify();
                }
            }
            public void message() {
                synchronized (ThreadTime.lock) {
                   while (seconds % 5 != 0) {
                       try {
                           ThreadTime.lock.wait();
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
                   seconds++;
                    System.out.println("Прошло 5 секунд");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ThreadTime.lock.notify();
                }
            }
        }

        class Clock implements Runnable {
            Worker worker;

            public Clock(Worker worker) {
                this.worker = worker;
            }

            @Override
            public void run() {
                while (true) {
                    worker.clock();
                }
            }
        }

        class Messanger implements Runnable {
            Worker worker;

            public Messanger(Worker worker) {
                this.worker = worker;
            }

            @Override
            public void run() {
                while (true) {
                    worker.message();
                }
            }
        }

