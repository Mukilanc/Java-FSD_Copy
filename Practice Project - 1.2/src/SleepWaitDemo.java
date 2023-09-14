public class SleepWaitDemo {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("Thread 1 is going to sleep for 5 seconds.");
                Thread.sleep(5000);
                System.out.println("Thread 1 woke up.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("Thread 2 is going to wait for 5 seconds.");
                synchronized (lock) {
                    lock.wait(5000);
                }
                System.out.println("Thread 2 was notified.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        thread1.start();
        thread2.start();


        try {
            Thread.sleep(1000);
            synchronized (lock) {
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.join();
        thread2.join();
    }
}
