package ThreadAndCreationOfThreads;

public class Thread_Runnable {
    public static void main(String args[]){
        Thread t1=new Thread(new MyThread1());
        t1.start();

    }
}

class MyThread1 implements Runnable{
    public void run(){
        System.out.println("Thread is running using Runnable interface");
    }
}
