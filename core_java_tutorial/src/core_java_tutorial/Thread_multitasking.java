package core_java_tutorial;
//How to perform single task by multiple threads?

//Note: Each thread run in a separate callstack.
public class Thread_multitasking extends Thread {
	
		 public void run(){  
		   System.out.println("task one");  
		 }  
		 public static void main(String args[]){  
		Thread_multitasking t1=new Thread_multitasking();  
	 	Thread_multitasking t2=new Thread_multitasking();  
	 	Thread_multitasking t3=new Thread_multitasking();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
		 }  
	}  
