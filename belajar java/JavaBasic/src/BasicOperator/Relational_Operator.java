package BasicOperator;

public class Relational_Operator extends Operator
{
	int a = 10;
	int b = 20;
	
	public void relational()
	{
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("b >= a = " + (b >= a));
		System.out.println("b <= a = " + (b <= a));
	}
}
