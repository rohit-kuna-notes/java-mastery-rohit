package createThread;

public class _5CreateThreads {
    public static void main(String[] args) {
        // TODO: MyThread1 myThread1 = new MyThread1();
        // TODO: myThread1.start();

        // TODO: Thread t2 = new Thread(new Task2());
        // TODO: t2.start();

        Thread t3 = new Thread(new Runnable(){
            // TODO: @Override
            public void run(){
                // TODO: System.out.println("way 3");
            }
        });
        // TODO: t3.start();

        Thread t4 = new Thread(()->{
            // TODO: System.out.println("way 4");
        });
        // TODO: t4.start();

        Thread t5 = new Thread(()->{
            // TODO: helperMethod();
        });
        // TODO: t5.start();

    }

    public static void helperMethod() {
        // TODO: System.out.println("way 5");
    }
}

class MyThread1 extends Thread {
    @Override
    public void run(){
        System.out.println("way 1");
    }
}

class Task2 implements Runnable {
    @Override
    public void run(){
        System.out.println("way 2");
    }
}
