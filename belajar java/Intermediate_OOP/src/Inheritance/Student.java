package Inheritance;

public class Student extends Person
{
	// Atributes
	private int credits;
	
	// Constructor
	public Student(String name, String address) 
	{
		// call the constructor of the upper class person.
		super(name,address);
		this.credits = 0;	// A new student does not have credits
	}
	
	// Accessors
	public int credits()
	{
		return this.credits;
	}
	
	// Method 
	public void study()
	{
		// when the student studies, his the upper class.
		this.credits += 1;
	}
	
	// Overide the toString method from the upper class.
	@Override
	public String toString() {
		// Add the credits to the toString method from the super class.
		return super.toString() + "\ncredits : " + this.credits;
	}
}