package ThreadsModule;
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i=0;i<=15;i++){
            System.out.println("child Thread");
        }
    }
}
public class ThreadDemo
{
    public static void main(String args[]){

        MyThread t1=new MyThread();
        t1.start();
        for (int i=0;i<=15;i++){
            System.out.println("main Thread");
        }
    }
}
