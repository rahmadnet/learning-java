package Comporator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Comparable 
{

	public static void main(String[] args) 
	{
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1010, "Rahmad", 100000.00, LocalDate.of(2019, 7, 15)));
		employees.add(new Employee(1004, "Andari", 95000.50, LocalDate.of(2019, 8, 16)));
		employees.add(new Employee(1015, "Rahmadi", 1000000.00, LocalDate.of(2018, 8, 10)));
		employees.add(new Employee(1009, "Rafi", 2000000.00, LocalDate.of(2020, 10, 19)));
		
		System.out.println("Employees (Before Sorting) : " + employees);
		
		// This will use the 'comparaTo' method of the 'Employee' class to compare two employees and sort them.
		Collections.sort(employees);
		
		System.out.println("\nEmployees (After Sorting) : " + employees);
	}

}
