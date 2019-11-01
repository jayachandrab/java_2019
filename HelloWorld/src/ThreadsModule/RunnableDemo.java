package ThreadsModule;

public class RunnableDemo {
    public static void main(String args[]){
        MyRunnable t1=new MyRunnable();
        Thread tob=new Thread(t1);
        tob.start();
        for (int i=0;i<=15;i++){
            System.out.println("main Thread");
        }
    }
}
