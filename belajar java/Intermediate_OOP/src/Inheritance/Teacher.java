package Inheritance;

public class Teacher extends Person
{	
	// Atributes 
	private int salary;
	
	// Construstor
	public Teacher(String name, String address, int salary) 
	{
		// Teacher inherits from the person class, call super constructor:
		super(name, address);
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nsalary  : " + this.salary + " euros/month";
	}
}
