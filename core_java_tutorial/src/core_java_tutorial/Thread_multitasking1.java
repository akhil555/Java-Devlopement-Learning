package core_java_tutorial;
//Program of performing single task by multiple threads 
//2nd Way/method
//Note: Each thread run in a separate callstack.
class Thread_multitasking1 implements Runnable{  
public void run(){  
System.out.println("task one");  
}  
  
public static void main(String args[]){  
Thread t1 =new Thread(new Thread_multitasking1());//passing annonymous object of TestMultitasking2 class  
Thread t2 =new Thread(new Thread_multitasking1());  
  
t1.start();  
t2.start();  
  
 }  
}  