package belajar.io;

import java.io.Serializable;

public class Student implements Serializable{
	private String Name;
	private double GPA;
	
	public Student(String name, double gpa) {
		this.Name = name;
		this.GPA = gpa;
	}

	public String getName() {
		return this.Name;
	}

	public String setName(String newname) {
		return (this.Name = newname);
	}

	public double getGPA() {
		return this.GPA;
	}

	public double setGPA(double newGPA) {
		return (this.GPA = newGPA);
	}
	
	@Override
	public String toString()
	{
		return String.format("%s\t%f", this.Name, this.GPA);
	}

}
