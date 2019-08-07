package LoopControl;

public class WhileLoop extends AssignmentLoop
{
	int x = 10;
	
	public void whileLoop()
	{
		while (x <= 20) 
		{
			System.out.println("Value of x : " + x);
			x++;;
		}
	}
}
