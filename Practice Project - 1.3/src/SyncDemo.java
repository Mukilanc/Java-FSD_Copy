public class SyncDemo {

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                incrementCount();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                incrementCount();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("The final value of the count variable is: " + count);
    }

    private static synchronized void incrementCount() {
        count++;
    }
}
