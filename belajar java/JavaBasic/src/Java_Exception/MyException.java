package Java_Exception;

public class MyException extends Exception
{
	// store account information
	private static int acno[] = {1001, 1002, 1003, 1004};
	
	private static String name[] = {"Rahmad", "Wildan", "Andari", "Rahmadi", "Rafi","Wandi"};
	
	private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
	
	// default constructor
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	
	// parametrized constructor
	MyException(String str)
	{
		super(str);
	}
	
	// write main
	public static void main(String[] args) {
		try {
			// display the heading for the table
			System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
			
			// display the actual account information
			for(int i = 0; i < 5 ; i++)
			{
				System.out.println(acno[i] + "\t" + name[i] + "\t" + "\t"+ bal[i]);
				
				// display own exception if balance < 1000
				if(bal[i] < 1000)
				{
					MyException me = new MyException("Balance is less than 1000"); throw me;
				}
			}
		} // end of try
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
