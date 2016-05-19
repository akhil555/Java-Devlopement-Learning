package core_java_tutorial;

/*Note: Garbage collection is performed by a daemon thread called Garbage Collector(GC).
 *  This thread calls the finalize() method before object is garbage collected.
 *  
 *  Note: Neither finalization nor garbage collection is guaranteed.
 *  
 *  Note: The Garbage collector of JVM collects only those objects that are created by new keyword.
 *   So if you have created any object without new, you can use finalize method to perform cleanup processing (destroying remaining objects).*/
public class TestGarbage1{  
	 public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){  
	  TestGarbage1 s1=new TestGarbage1();  
	  TestGarbage1 s2=new TestGarbage1();  
	  s1=null;  
	  s2=null;  
	  System.gc();  
	 }  
	} 