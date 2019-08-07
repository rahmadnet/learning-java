
public class student {

	int roll_no;
	String name;
	
	student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
	
	public void my_method()
	{
		System.out.println("Nama Santri : ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] arr;
		arr = new student[5];
		
		arr[0]= new student(1, "sidiq");
		arr[1]= new student(2, "wandi");
		arr[2]= new student(3, "wildan");
		arr[3]= new student(4, "andy");
		arr[4]= new student(5, "sofian");
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
		}
	}

}







