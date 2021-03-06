package core_java_tutorial;

/*Shutdown Hook

The shutdown hook can be used to perform cleanup resource or save the state when JVM shuts down normally or abruptly. Performing clean resource means closing log file, sending some alerts or something else. So if you want to execute some code before JVM shuts down, use shutdown hook.

When does the JVM shut down?

The JVM shuts down when:
user presses ctrl+c on the command prompt
System.exit(int) method is invoked
user logoff
user shutdown etc.*/






class MyThread extends Thread{  
    public void run(){  
        System.out.println("shut down hook task completed..");  
    }  
}  
  
public class TestShutdown1{  
public static void main(String[] args)throws Exception {  
 //The object of Runtime class can be obtained by calling the static factory method getRuntime(). For example: 
Runtime r=Runtime.getRuntime();  

//The addShutdownHook() method of Runtime class is used to register the thread with the Virtual Machine. Syntax:
r.addShutdownHook(new MyThread());  
      
System.out.println("Now main sleeping... press ctrl+c to exit");  
try{Thread.sleep(3000);}catch (Exception e) {}  
}  
}  

//Note: The shutdown sequence can be stopped by invoking the halt(int) method of Runtime class.

