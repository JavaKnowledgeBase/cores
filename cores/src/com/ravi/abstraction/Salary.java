package com.ravi.abstraction;

/*Extending Abstract Class:
We can extend Employee class in normal way as follows:
*/

public class Salary extends Employee {

	private double salary; //Annual salary
	
	public Salary(String name, String address, int number, double
		      salary) {
		super(name, address, number);
		setSalary(salary);
		System.out.println("Constructing an Employee");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 public void mailCheck()
	   {
	       System.out.println("Within mailCheck of Salary class ");
	       System.out.println("Mailing check to " + getName()
	       + " with salary " + salary);
	   }
	 
	 public double computePay()
	   {
	      System.out.println("Computing salary pay for " + getName());
	      return salary/52;
	   }
	

}
