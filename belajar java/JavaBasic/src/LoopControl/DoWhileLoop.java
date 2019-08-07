package LoopControl;

public class DoWhileLoop extends AssignmentLoop
{
	
	public void doWhile()
	{
		int x = 10;
		do
		{
			System.out.println("Value of x : " + x);
			x++;
		}
		while(x <= 20);
	}
}
