package Comporator;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;
	
	public Employee(int id, String name, double salary, LocalDate joininDate)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joininDate;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public LocalDate getJoiningDate() {
		return joiningDate;
	}



	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}



	@Override
	public int compareTo(Employee anotherEmployee)
	{
		// TODO Auto-generated method stub
		return this.getId() - anotherEmployee.getId();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Employee employee = (Employee) obj;
		return id == employee.id;
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(id);
	}
	
	@Override
	public String toString() 
	{
		return "\nID = " + id
				+ ", NAME : " + name
				+ ", SALARY : " + salary
				+ ", JOINING DATE : " + joiningDate
				+ "\n";
	}
	
}
