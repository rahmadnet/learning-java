package belajar.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO
{

	private static Scanner scan;

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		File file = new File("test.txt");
		
		//Write your name and age to the file
		
//		try
//		{
//			PrintWriter output = new PrintWriter(file);
//			output.println("Rahmad Nasution ");
//			output.println(24);			
//
//			output.close();
//		} catch (IOException ex) {
//			System.out.printf("EROR : %s\n", ex);
//		}
//		
//		// Reads from the file
//		try {
//			scan = new Scanner(file);
//			String name = scan.nextLine();
//			int umur = scan.nextInt();
//		
//			System.out.printf("Name : %s\nUmur : %d\n",name, umur);
//		} catch (FileNotFoundException ex) {
//			System.out.printf("ERROR : %s/n",ex);		
//		}
		
		File file1 = new File("students.txt");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Rahmad",3.921));
		students.add(new Student("Rahmadi", 4.0));
		students.add(new Student("Andari", 2.0));
		//serialize the collection of student
		FileOutputStream fo = new FileOutputStream(file1);
		ObjectOutputStream output1 = new ObjectOutputStream(fo);
		for(Student s : students)
		{
			output1.writeObject(s);
		}
		
		output1.close();
		fo.close();
		//deserelize the file back into the collection
		FileInputStream fi = new FileInputStream(file1);
		ObjectInputStream input1 = new ObjectInputStream(fi);
		
		ArrayList<Student> students2 = new ArrayList<Student>();
		try {
			while (true)
			{
				Student s1 = (Student)input1.readObject();
				students2.add(s1);
			}
			
		} catch (EOFException ex) {
			// TODO: handle exception
		}
		for(Student s : students2)
		{
			System.out.println(s);
		}
		
	}

}
