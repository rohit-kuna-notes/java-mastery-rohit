package createThread;
public class _2ThreadExtendsExample {
    public static void main(String[] args){
        // TODO: Thread t1 = new MyThread();
        // TODO: t1.run();
        // TODO: t1.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread: "+i);
        }
    }
}
