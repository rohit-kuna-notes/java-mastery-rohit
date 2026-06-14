package createThread;
public class _4RunnableLambdaExpression {
    public static void main(String[] args){
        Thread t1=new Thread(()->{
            for(int i=0;i<=10;i++){
                // TODO: System.out.println("thread 1 : "+i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<=15;i++){
                // TODO: System.out.println("thread 2: "+ i);
            }
        });

        // TODO: t1.start();
        // TODO: t2.start();

    }
}
