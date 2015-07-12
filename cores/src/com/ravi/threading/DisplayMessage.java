package com.ravi.threading;

/*Step 1:
 * test
As a first step you need to implement a run() method provided by Runnable interface. This method provides entry point for the thread and you will put you complete business logic inside this method. Following is simple syntax of run() method:

public void run( )
Step 2:
At second step you will instantiate a Thread object using the following constructor:

Thread(Runnable threadObj, String threadName);
Where, threadObj is an instance of a class that implements the Runnable interface and threadName is the name given to the new thread.

Step 3
Once Thread object is created, you can start it by calling start( ) method, which executes a call to run( ) method. Following is simple syntax of start() method:

void start( );
*/

public class DisplayMessage implements Runnable {

	private String message;
	   public DisplayMessage(String message)
	   {
	      this.message = message;
	   }
	   
	@Override
	public void run() {
		while(true)
	      {
	         System.out.println(message);
	      }
		
	}
	
	

}
