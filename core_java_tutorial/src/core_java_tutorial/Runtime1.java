package core_java_tutorial;

/*
 * 

Java Runtime class

Java Runtime class is used to interact with java runtime environment.
Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc.
There is only one instance of java.lang.Runtime class is available for one java application.

The Runtime.getRuntime() method returns the singleton instance of Runtime class.*/


public class Runtime1{  
	 public static void main(String args[])throws Exception{  
	  Runtime.getRuntime().exec("notepad");//will open a new notepad  
	 }  
	}  