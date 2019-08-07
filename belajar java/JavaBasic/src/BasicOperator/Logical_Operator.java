package BasicOperator;

public class Logical_Operator extends Operator
{
	boolean a = true;
	boolean b = false;
	
	public void logical()
	{
		System.out.println("a && b = " + (a&&b));
		System.out.println("a || b = " + (a||b));
		System.out.println("!(a && b) = " + !(a&&b));
	}
}
