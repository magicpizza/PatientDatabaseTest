package org.patientdatabase.tutorial;
// a class contains 3 things:
// 	- fields for data
//	- constructors for creating objects
//	- methods for changing objects?

public class Patient {
	// fields or otherwise the "state" of the object
	private String name; //name of patient
	private int age; //age of patient
	private int sex; //sex of patient (0 is f, 1 is m and 2 is other) 

	// constructors create those objects (i think theyre the default baseline?)
	// when you set a method/constructor you need to have a set of ()
	// the () enclose parameters that are passed to the method/constructor
	public Patient()	{
		name = "unknown name";
		age = 0;
		sex = 0;
	}
	// get method returns the Class field value
	// set method sets the Class field value
	public String getName() {
		return name;
	}
	// as mentioned above, the () contain the parameters that are passed onto the
	// method then goes to name = anyName
	// the parameter must be defined as (parameterType parameterName)
	public void setName(String anyName) {		
		name = anyName;
	}
	public int getAge() {
		return age;
	}
	// as shown, this.age is a different parameter to age in the setAge method below
	// 'age' is in black and thus is a LOCAL variable whilst this.age is blue, 
	// meaning it is a class field for the current object Person. 
	// THIS means the current object. 
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String toString() {
		return this.getName()+ " ("+ this.getAge() +"yo)";
	}
	
}
