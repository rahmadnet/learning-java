package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class TestMain 
{
	// Method prints all the people in the parameter list.
	public static void printDepartement(List<Person> people)
	{
		for (Person person : people)
		{
			// For each person in the list, print out yhe default toString
			System.out.println("");
			System.out.println(person);
		}
	}
	
	public static void main(String[] args) 
	{
		// Test Person 
		System.out.println("==============PERSON=================");
		Person Rahmad = new Person("Rahmad Nasution", "Medan");
		Person Wandi = new Person("Wandi Pratama", "Prabumulih");
		System.out.println(Rahmad);
		System.out.println("");
		System.out.println(Wandi);
		
		// Test Student 1
		System.out.println("==============STUDENT===============");
		Student Rahmadi = new Student("Rahmadi Cahaya Putra", "Jambi");
		System.out.println(Rahmadi);
		System.out.println("Credits : " + Rahmadi.credits());
		Rahmadi.study();
		System.out.println("Credits : " + Rahmadi.credits());
		
		// test Student 2
		System.out.println("==============STUDENT===============");
		Student Ismail = new Student("Ismail Pradana", "Kuala Simpang");
		System.out.println(Ismail);
		System.out.println("");
		Ismail.study();
		System.out.println(Ismail);
		
		// test Teacher
		System.out.println("==============TEACHER===============");
		Teacher Jamal = new Teacher("Jamaludin s.kom", "Setia Budi", 1000);
		Teacher Fathur = new Teacher("Fathur Rohman", "Yos Sudarso", 2000);
		System.out.println(Jamal);
		System.out.println("");
		System.out.println(Fathur);
		
		
		Student Ikhsan = new Student("M.Ikhsan Nasution", "Mabar");
		for (int i = 0; i < 25; i++)
		{
			Ikhsan.study();
		}
		System.out.println("");
		System.out.println(Ikhsan);
		
		// test People
		System.out.println("==============TEACHER===============");

		List<Person> people = new ArrayList<Person>();
		
		people.add(new Teacher("Fatimah", "Pancing", 20000));
		people.add(new Student("Saleha Nurdiningsih", "Aceh"));
		people.add(new Teacher("Syahlan", "Manyabar", 500));
		printDepartement(people);
	


	}
}
