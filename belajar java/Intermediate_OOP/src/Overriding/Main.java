package Overriding;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Home h1 = new Home();
		Home h2 = new Office();
		
		h1.bathroom();
		h2.bathroom();
		h1.room();
		h2.room();
	}

}
