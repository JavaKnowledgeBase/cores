package com.ravi.threading;

/*The second way to create a thread is to create a new class that extends Thread class using the following two simple steps. This approach provides more flexibility in handling multiple threads created using available methods in Thread class.

Step 1
You will need to override run( ) method available in Thread class. This method provides entry point for the thread and you will put you complete business logic inside this method. Following is simple syntax of run() method:

public void run( )
Step 2
Once Thread object is created, you can start it by calling start( ) method, which executes a call to run( ) method. Following is simple syntax of start() method:

void start( );
*/

public class GuessANumber extends Thread {
	
	private int number;
	
	public GuessANumber(int number) {
		super();
		this.number = number;
	}

	public void run()
	   {
	      int counter = 0;
	      int guess = 0;
	      do
	      {
	          guess = (int) (Math.random() * 100 + 1);
	          System.out.println(this.getName()
	                       + " guesses " + guess);
	          counter++;
	      }while(guess != number);
	      System.out.println("** Correct! " + this.getName()
	                       + " in " + counter + " guesses.**");
	   }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
