import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.LogManager;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Executors.newFixedThreadPool()

        System.out.println("Before thread,Name of thread:"+Thread.currentThread().getName()+", State: "+Thread.currentThread().getState());

        Thread workerThread=new Thread(()->{
            System.out.println("Inside the thread,Name of thread:"+Thread.currentThread().getName()+", State: "+Thread.currentThread().getState());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        workerThread.start();
//        workerThread.join();
        System.out.println("After worker thread execution,Name of thread:"+workerThread.getName()+", State of workerThread: "+workerThread.getState());
        System.out.println("After thread,Name of thread:"+Thread.currentThread().getName()+", State: "+Thread.currentThread().getState());

        }
    }
