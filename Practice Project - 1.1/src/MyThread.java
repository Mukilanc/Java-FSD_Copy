public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("I am a thread created by extending the 'Thread' class.");
    }


    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
    }
