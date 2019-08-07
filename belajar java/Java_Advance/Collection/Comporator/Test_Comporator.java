package Comporator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_Comporator 
{
	public static void main(String[] args) 
	{
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1010, "Rahmad", 100000.00, LocalDate.of(2019, 7, 15)));
		employees.add(new Employee(1004, "Andari", 95000.50, LocalDate.of(2019, 8, 16)));
		employees.add(new Employee(1015, "Rahmadi", 1000000.00, LocalDate.of(2018, 8, 10)));
		employees.add(new Employee(1009, "Rafi", 2000000.00, LocalDate.of(2020, 10, 19)));
		
		System.out.println("Employees : \n" + employees);
		
		// Sort employees by Name
		Collections.sort(employees, Comparator.comparing(Employee::getName));
		System.out.println("\nEmployees (Sorted by Name) : " + employees);
	
		// Sort employees by Salary
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
		System.out.println("\nEmployees (Sorted by Salary) : " + employees);
		
		// Sort employees by JoiningDate
		Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
		System.out.println("\nEmployees (Sorted by Joining Date) : " + employees);
		
		// Sort employees by Name in descending order
		Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
		System.out.println("\nEmployees (Sorted by Name in descending order) : " + employees);
		
		// chaining multiple Comparators
		// Sort by Salary. If Salary is same then sort by Name
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
		System.out.println("\nEmployees (Sorted by Salary and Name) : " + employees);
		
		
	}

}
