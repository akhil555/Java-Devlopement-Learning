package core_java_tutorial;
//How to perform multiple tasks by multiple threads (multitasking in multithreading)?

//If you have to perform multiple tasks by multiple threads,have multiple run() methods.For example:

public class Multask_Multithread {
	
	 public static void main(String args[]){  
	  Simple1 t1=new Simple1();  
	  Simple2 t2=new Simple2();  
	  
	  t1.start();  
	  t2.start();  
	 }
}
class Simple1 extends Thread{  
	 public void run(){  
	   System.out.println("task one");  
	 }  
	}  
	  
	class Simple2 extends Thread{  
	 public void run(){  
	   System.out.println("task two");  
	 }  
	}  
	  
	
	 