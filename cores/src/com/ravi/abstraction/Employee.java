package com.ravi.abstraction;
/*Abstraction refers to the ability to make a class abstract in OOP. 
 * An abstract class is one that cannot be instantiated. 
 * All other functionality of the class still exists, and its fields, methods, and constructors are all accessed in the same manner. 
 * You just cannot create an instance of the abstract class.
 * If a class is abstract and cannot be instantiated, the class does not have much use unless it is subclass. 
 * This is typically how abstract classes come about during the design phase. 
 * A parent class contains the common functionality of a collection of child classes, but the parent class itself is too abstract to be used on its own.
*/

/*Use the abstract keyword to declare a class abstract. 
 * The keyword appears in the class declaration somewhere before the class keyword.
 */

public abstract class Employee {
	
	public Employee(String name, String address, int number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	private String name;
	private String address;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
