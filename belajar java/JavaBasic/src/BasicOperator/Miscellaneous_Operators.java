package BasicOperator;

public class Miscellaneous_Operators extends Operator
{
	int a, b;
	String name;
	public void misc()
	{
		a = 10;
		b = (a == 1) ? 20: 30;
		System.out.println("Value of b is : " + b);
		
		b = (a == 10) ? 20: 30;
		System.out.println("value of is : " + b);
		
		name = "James";
		
		boolean result = name instanceof String;
		System.out.println(result);
	}
	
}
