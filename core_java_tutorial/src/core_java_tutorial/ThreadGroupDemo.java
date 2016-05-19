package core_java_tutorial;
//Java provides a convenient way to group multiple threads in a single object. In such way, we can suspend, 
//resume or interrupt group of threads by a single method call.

/* Important Methods of threadgroup  Class 
int activeCount()	returns no. of threads running in current group.
2)	int activeGroupCount()	returns a no. of active group in this thread group.
3)	void destroy()	destroys this thread group and all its sub groups.
4)	String getName()	returns the name of this group.
5)	ThreadGroup getParent()	returns the parent of this group.
6)	void interrupt()	interrupts all threads of this group.
7)	void list()
*/



public class ThreadGroupDemo implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
      ThreadGroupDemo runnable = new ThreadGroupDemo();  
      //ThreadGroup(ThreadGroup parent, String name)
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
            
          Thread t1 = new Thread(tg1, runnable,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1, runnable,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1, runnable,"three");  
          t3.start();  
               
          System.out.println("Thread Group Name: "+tg1.getName());  
          tg1.list();  
  
    }  
   }  
