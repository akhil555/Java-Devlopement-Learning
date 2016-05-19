package core_java_tutorial;
//Same example as above by annonymous class that implements Runnable interface:

//Program of performing two tasks by two threads
class TestMultitasking5{  
	 public static void main(String args[]){  
	  Runnable r1=new Runnable(){  
	    public void run(){  
	      System.out.println("task one");  
	    }  
	  };  
	  
	  Runnable r2=new Runnable(){  
	    public void run(){  
	      System.out.println("task two");  
	    }  
	  };  
	      
	  Thread t1=new Thread(r1);  
	  Thread t2=new Thread(r2);  
	  
	  t1.start();  
	  t2.start();  
	 }  
	}
