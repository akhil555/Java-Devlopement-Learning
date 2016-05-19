import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//what i unserstood from the code is fixed group of threads run at a time their priority is decided by scheduler if not defined ,as soon as any of the thread gets free 
//it can be used for different purpose.  like freepoool emplyoee

public class Thread_pool {
 
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
 
}

class WorkerThread implements Runnable {
    private String message;
    public WorkerThread(String s){
        this.message=s;
    }
 
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }
 
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
   
}